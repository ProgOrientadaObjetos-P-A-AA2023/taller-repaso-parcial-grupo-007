/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

import paquete001.Persona;
import paquete002.Propiedad;

/**
 *
 * @author reroes
 */
public class PagoPredial extends Pago {
    private double valorPropiedad;
    private double porcentaje;
    
    @Override
    public void calcularPago(){
        valorPropiedad = 56000;
        porcentaje = 10;
        pago = valorPropiedad - ((valorPropiedad*porcentaje)/100);
    }

    public double obtenerValorPropiedad() {
        return valorPropiedad;
    }

    public void establecerValorPropiedad(double n) {
        valorPropiedad = n;
    }

    public double obtenerPorcentaje() {
        return porcentaje;
    }

    public void establecerPorcentaje(double n) {
        porcentaje = n;
    }
}
