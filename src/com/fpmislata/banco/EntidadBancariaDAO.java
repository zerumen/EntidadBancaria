/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class EntidadBancariaDAO {

    Connection connection = null;
    ResultSet resultset = null;
    
    EntidadBancariaDAO() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco","root", "root");
        
    }
    
    
    EntidadBancaria read(int idEntidad) throws SQLException{
        EntidadBancaria entidadbancaria;
        String userid;
        String selectSQL = "SELECT idEntidad,codigoEntidad,nombre,CIF,tipoEntidadBancaria FROM entidadBancaria WHERE idEntidad = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
        preparedStatement.setInt(1, idEntidad);
        resultset = preparedStatement.executeQuery();
        
        
        
        
        
        if(resultset.next()==true){
        entidadbancaria=new EntidadBancaria();
        entidadbancaria.setIdEntidadBancaria(resultset.getInt("idEntidad"));
        entidadbancaria.setCodigoEntidad(resultset.getString("codigoEntidad"));
        entidadbancaria.setNombre(resultset.getString("nombre"));
        entidadbancaria.setCif(resultset.getString("CIF"));
        String tipoEntidadBancaria=resultset.getString("tipoEntidadBancaria");
        entidadbancaria.setEntidad(TipoentidadBancaria.valueOf(tipoEntidadBancaria));
            if (resultset.next()==true){
                //System.out.println("·Existe mas de una entidadBancaria");
               throw new RuntimeException("·Existe mas de una entidadBancaria");
            }
        }else{
            //System.out.println("No existe la entidad Bancaria:");
             RuntimeException runtimeException=new RuntimeException("No existe la entidad Bancaria:");
                throw runtimeException;
                
        }
        
        return entidadbancaria;
    
    }
    
    void Insert(EntidadBancaria entidadBancaria) throws SQLException{
        
        String insertTableSQL = "INSERT INTO entidadBancaria"
		+ "(idEntidad, codigoEntidad, nombre, cif,tipoEntidadBancaria) VALUES"
		+ "(?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertTableSQL);
        preparedStatement.setInt(1, entidadBancaria.getIdEntidadBancaria());
        preparedStatement.setString(2, entidadBancaria.getCodigoEntidad());
        preparedStatement.setString(3, entidadBancaria.getNombre());
        preparedStatement.setString(4, entidadBancaria.getCif());
        preparedStatement.setString(5, entidadBancaria.getEntidad().toString());

        preparedStatement .executeUpdate();
        System.out.println("Insertado registro!");
    }
    
    void Update(EntidadBancaria entidadBancaria) throws SQLException{
        
        String updateTableSQL = "UPDATE entidadBancaria SET codigoentidad = ?, nombre = ?, cif = ?,tipoEntidadBancaria = ? WHERE idEntidad = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(updateTableSQL);
        
        preparedStatement.setString(1, entidadBancaria.getCodigoEntidad());
        preparedStatement.setString(2, entidadBancaria.getNombre());
        preparedStatement.setString(3, entidadBancaria.getCif());
        preparedStatement.setString(4, entidadBancaria.getEntidad().toString());
        preparedStatement.setInt(5, entidadBancaria.getIdEntidadBancaria());
// execute insert SQL stetement
        preparedStatement .executeUpdate();
        System.out.println("modificado registro!");
    }
    
    void Delete(int entidadBancaria) throws SQLException{
        String deleteSQL = "DELETE from entidadbancaria WHERE idEntidad = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL);
        preparedStatement.setInt(1,entidadBancaria);
// execute delete SQL stetement
        preparedStatement.executeUpdate();
        
        System.out.println("Eliminado registro!!");
        connection.close();
        
    }
    
    List<EntidadBancaria> findAll() throws SQLException{
        List <EntidadBancaria> entidadBancarias=new ArrayList();
        EntidadBancaria entidadBancaria;
        String listaSQL="SELECT idEntidad,codigoEntidad, nombre, cif, tipoEntidadBancaria from entidadbancaria";
        PreparedStatement preparedStatement= connection.prepareStatement(listaSQL);
        resultset = preparedStatement.executeQuery();
        
        while(resultset.next()==true){
        entidadBancaria=new EntidadBancaria();
        
        entidadBancaria.setIdEntidadBancaria(resultset.getInt("idEntidad"));
        entidadBancaria.setCodigoEntidad(resultset.getString("codigoEntidad"));
        entidadBancaria.setNombre(resultset.getString("nombre"));
        entidadBancaria.setCif(resultset.getString("CIF"));
        String tipoEntidadBancaria=resultset.getString("tipoEntidadBancaria");
        entidadBancaria.setEntidad(TipoentidadBancaria.valueOf(tipoEntidadBancaria));
        entidadBancarias.add(entidadBancaria);
        }
        return entidadBancarias;
        
    }
    
    List<EntidadBancaria> findByCodigo(String codigo) throws SQLException{
        
       List <EntidadBancaria> entidadBancarias=new ArrayList();
        EntidadBancaria entidadBancaria;
        String listaSQL="SELECT idEntidad,codigoEntidad, nombre, cif, tipoEntidadBancaria from entidadbancaria where codigoEntidad = ?";
        PreparedStatement preparedStatement= connection.prepareStatement(listaSQL);
         preparedStatement.setString(1, codigo);
        resultset = preparedStatement.executeQuery();
        
        while(resultset.next()==true){
        entidadBancaria=new EntidadBancaria();
        
        entidadBancaria.setIdEntidadBancaria(resultset.getInt("idEntidad"));
        entidadBancaria.setCodigoEntidad(resultset.getString("codigoEntidad"));
        entidadBancaria.setNombre(resultset.getString("nombre"));
        entidadBancaria.setCif(resultset.getString("CIF"));
        String tipoEntidadBancaria=resultset.getString("tipoEntidadBancaria");
        entidadBancaria.setEntidad(TipoentidadBancaria.valueOf(tipoEntidadBancaria));
        entidadBancarias.add(entidadBancaria);
        }
        return entidadBancarias;
        
    }
}
