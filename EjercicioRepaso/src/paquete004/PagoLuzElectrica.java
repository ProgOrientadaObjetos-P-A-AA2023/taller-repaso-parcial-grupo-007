/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

import paquete001.Persona;
import paquete002.Ciudad;

/**
 *
 * @author reroes
 */
public class PagoLuzElectrica extends Pago {
    private double tarifaBase;
    private double kilovatiosConsumidos;
    private double costoKilovatio;
    private Ciudad ciudad;
    
    public PagoLuzElectrica(Ciudad c, double tb, double k, double ck) {
        ciudad = c;
        tarifaBase = tb;
        kilovatiosConsumidos = k;
        costoKilovatio = ck;
    }
    
    @Override
    public void calcularPago() {
        tarifaBase = 10.20;
        kilovatiosConsumidos = 80;
        costoKilovatio = 0.5;
        if (ciudad.obtenerNombreCiudad().equals("Loja")) {
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

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public void establecerCiudad(Ciudad n) {
        ciudad = n;
    }
    
    @Override
    public String toString () {
        String cadena = String.format("PAGO LUZ ELECTRICA\n"
                + "Ciudad: %s\n"
                + "Tarifa base: %.2f\n"
                + "kilovatios de consumo: %.2f\n"
                + "Costo de kilovatios: %.2f\n%s\n",
                obtenerCiudad().obtenerNombreCiudad(),
                obtenerTarifaBase(),
                obtenerKilovatiosConsumidos(),
                obtenerCostoKilovatio(),
                obtenerPago());
        return cadena;
    }
}
