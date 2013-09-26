/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco;

/**
 *
 * @author alumno
 */
public class EntidadBancaria {
    
    private int id;
    private int codigoEntidad;
    private String nombre;
    private String cif;
    private TipoentidadBancaria entidad;
    
    public EntidadBancaria(int id,int codigoEntidad,String nombre,String cif, TipoentidadBancaria entidad){
        this.id=id;
        this.codigoEntidad=codigoEntidad;
        this.nombre=nombre;
        this.cif=cif;
        this.entidad=entidad;
        
    }
    
    public EntidadBancaria(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigoEntidad() {
        return codigoEntidad;
    }

    public void setCodigoEntidad(int codigoEntidad) {
        this.codigoEntidad = codigoEntidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public TipoentidadBancaria getEntidad() {
        return entidad;
    }

    public void setEntidad(TipoentidadBancaria entidad) {
        this.entidad = entidad;
    }
    
   
   
}
