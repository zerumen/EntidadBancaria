/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

/**
 *
 * @author alumno
 */
public class Main {
    
     public static void main(String[] args) {
        EntidadBancaria entidadBancaria1=new EntidadBancaria(1,"v50","Bankia","B5642354",TipoentidadBancaria.BANCO );
        EntidadBancaria entidadBancaria2=new EntidadBancaria(2,"v51","Bankia","B5645258",TipoentidadBancaria.BANCO );
        
        Sucursal sucursal1=new Sucursal(1,"m31","Malilla",entidadBancaria1);
            entidadBancaria1.getSucursalesBancarias().add(sucursal1);
        Sucursal sucursal2=new Sucursal(2,"t40","Torrent",entidadBancaria2);
            entidadBancaria2.getSucursalesBancarias().add(sucursal2);
        
        
        CuentaBancaria cuenta1=new CuentaBancaria(224,sucursal1,"142575135","50",new BigDecimal("0"),"B3454322");
            sucursal1.getCuentasBan().add(cuenta1);
        CuentaBancaria cuenta2=new CuentaBancaria(335,sucursal2,"424554552","50",new BigDecimal("700"),"H254455");
            sucursal2.getCuentasBan().add(cuenta2);
        
        MovimientoBancario movimiento1=new MovimientoBancario(50, TipoMovimientoBancario.DEBE, new BigDecimal("50"),new GregorianCalendar(2008,10,1).getTime() ,new BigDecimal("650"), "Pago Deuda",cuenta1);
            cuenta1.getMovimientoBancario().add(movimiento1);
        MovimientoBancario movimiento2=new MovimientoBancario(55, TipoMovimientoBancario.HABER, new BigDecimal("50"), new GregorianCalendar(2012,9,5).getTime(),new BigDecimal("1500"), "Pago Deuda",cuenta2);
            cuenta1.getMovimientoBancario().add(movimiento2);
            
        detalleMov(cuenta1);
            
        
        
    }
     public static void detalleMov(CuentaBancaria cuentaBancaria){
         System.out.println("Numero de cuenta :"+cuentaBancaria.getNumeroCuenta()+" DC :"+cuentaBancaria.getDc()+" Cod sucursal :"+cuentaBancaria.getSucursalBancaria().getCodigoSucursal()+" Codigo Entidad :"+cuentaBancaria.getSucursalBancaria().getEntidadBancaria().getCodigoEntidad());
         
      for(MovimientoBancario movimientoBancario : cuentaBancaria.getMovimientoBancario()){
          System.out.println(" Importe Movimiento : "+ movimientoBancario.getImporte()+ " Tipo movimiento : " +movimientoBancario.getMovimiento()+" Fecha :"+movimientoBancario.getFecha());
      }   
         
     }
    
}
