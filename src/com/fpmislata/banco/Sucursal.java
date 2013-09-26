/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco;

/**
 *
 * @author alumno
 */
public class Sucursal {
    
    private int idSucursalBancaria;
    private int codigoSucursal;
    private String nombre;
    private EntidadBancaria entidadBancaria;

    public Sucursal(int idSucursalBancaria, int codigoSucursal, String nombre, EntidadBancaria entidadBancaria) {
        this.idSucursalBancaria = idSucursalBancaria;
        this.codigoSucursal = codigoSucursal;
        this.nombre = nombre;
        this.entidadBancaria = entidadBancaria;
    }

    public Sucursal() {
        
    }


    public int getIdSucursalBancaria() {
        return idSucursalBancaria;
    }

    public void setIdSucursalBancaria(int idSucursalBancaria) {
        this.idSucursalBancaria = idSucursalBancaria;
    }

    public int getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(int codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EntidadBancaria getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setEntidadBancaria(EntidadBancaria entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }


    
    
    
    
}
