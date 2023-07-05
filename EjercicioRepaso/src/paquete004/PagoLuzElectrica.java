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
public class PagoLuzElectrica extends Pago {
    private double tarifaBase;
    private double kilovatiosConsumidos;
    private double costoKilovatio;
    private String ciudad;
    
    @Override
    public void calcularPago() {
        tarifaBase = 10.20;
        kilovatiosConsumidos = 80;
        costoKilovatio = 0.5;
        ciudad = "Loja";
        if (ciudad.equals("Loja")) {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    public void establecerTarifaBase(double n) {
        tarifaBase = n;
    }

    public double obtenerKilovatiosConsumidos() {
        return kilovatiosConsumidos;
    }

    public void establecerKilovatiosConsumidos(double n) {
        kilovatiosConsumidos = n;
    }

    public double obtenerCostoKilovatio() {
        return costoKilovatio;
    }

    public void establecerCostoKilovatio(double n) {
        costoKilovatio = n;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public void establecerCiudad(String n) {
        ciudad = n;
    }
}
