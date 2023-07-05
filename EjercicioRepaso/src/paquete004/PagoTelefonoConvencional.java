/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

import paquete001.Persona;

/**
 *
 * @author reroes
 */
public class PagoTelefonoConvencional extends Pago{
    private double tarifa;
    private double minutosConsumidos;
    private double costoMinuto;

    @Override
    public void calcularPago(){
        tarifa = 6.20;
        minutosConsumidos = 100;
        costoMinuto = 0.2;
        pago = tarifa + (minutosConsumidos * costoMinuto);
    }
    
    public double obtenerTarifa() {
        return tarifa;
    }

    public void establecerTarifa(double n) {
        tarifa = n;
    }

    public double obtenerMinutosConsumidos() {
        return minutosConsumidos;
    }

    public void establecerMinutosConsumidos(double n) {
        minutosConsumidos = n;
    }

    public double obtenerCostoMinuto() {
        return costoMinuto;
    }

    public void establecerCostoMinuto(double n) {
        costoMinuto = n;
    }
}
