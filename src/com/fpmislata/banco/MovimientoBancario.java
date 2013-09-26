/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author alumno
 */
public class MovimientoBancario {
    
    private int idMovimientoBancario;
    private TipoMovimientoBancario movimiento;
    private int importe;
    private Date fecha;
    private BigDecimal saldo;
    private String concepto;

    public MovimientoBancario(int idMovimientoBancario, TipoMovimientoBancario movimiento, int importe, Date fecha, BigDecimal saldo, String concepto) {
        this.idMovimientoBancario = idMovimientoBancario;
        this.movimiento = movimiento;
        this.importe = importe;
        this.fecha = fecha;
        this.saldo = saldo;
        this.concepto = concepto;
    }

    public MovimientoBancario() {
    }

    public int getIdMovimientoBancario() {
        return idMovimientoBancario;
    }

    public void setIdMovimientoBancario(int idMovimientoBancario) {
        this.idMovimientoBancario = idMovimientoBancario;
    }

    public TipoMovimientoBancario getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(TipoMovimientoBancario movimiento) {
        this.movimiento = movimiento;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    
    
    
}
