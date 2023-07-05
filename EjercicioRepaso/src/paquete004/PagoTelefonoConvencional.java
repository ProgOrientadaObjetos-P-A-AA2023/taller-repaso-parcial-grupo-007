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
    
    public PagoTelefonoConvencional(double t, double m, double cm) {
        tarifa = t;
        minutosConsumidos = m;
        costoMinuto = cm;
    }
    
    @Override
    public void calcularPago(){
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
    
    @Override
    public String toString () {
        String cadena = String.format("PAGO TELEFONO CONVENCIONAL\n"
                + "Tarifa: %.2f\n"
                + "Minutos consumidos: %.2f\n"
                + "Costo minutos: %.2f\n%s\n",              
                obtenerTarifa(),
                obtenerMinutosConsumidos(),
                obtenerCostoMinuto(),
                super.toString());
        return cadena;
    }
}
