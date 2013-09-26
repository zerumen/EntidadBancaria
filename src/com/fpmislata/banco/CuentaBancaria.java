/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco;

import java.math.BigDecimal;

/**
 *
 * @author alumno
 */
public class CuentaBancaria {
    
    private int idCuentaBancaria;
    private Sucursal sucursalBancaria;
    private int numeroCuenta;
    private int dc;
    private BigDecimal saldo;
    private String cif;

    public CuentaBancaria(int idCuentaBancaria, Sucursal sucursalBancaria, int numeroCuenta, int dc, BigDecimal saldo, String cif) {
        this.idCuentaBancaria = idCuentaBancaria;
        this.sucursalBancaria = sucursalBancaria;
        this.numeroCuenta = numeroCuenta;
        this.dc = dc;
        this.saldo = saldo;
        this.cif = cif;
    }
    
    public CuentaBancaria(){
        
    }

    public int getIdCuentaBancaria() {
        return idCuentaBancaria;
    }

    public void setIdCuentaBancaria(int idCuentaBancaria) {
        this.idCuentaBancaria = idCuentaBancaria;
    }

    public Sucursal getSucursalBancaria() {
        return sucursalBancaria;
    }

    public void setSucursalBancaria(Sucursal sucursalBancaria) {
        this.sucursalBancaria = sucursalBancaria;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDc() {
        return dc;
    }

    public void setDc(int dc) {
        this.dc = dc;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }


    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }
    
    
}
