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
public class PagoAguaPotable extends Pago {
    private String tipo;
    private double tarifaFija;
    private double metrosCubicosConsumo;
    private double costoConsumoCubicos;
    
    public PagoAguaPotable(String t, double p) {
        tipo = t;
    }
    
    @Override
    public void calcularPago(){
        if(tipo.equals("comercial")){
            tarifaFija = 2.20;
            metrosCubicosConsumo = 100.2;
            costoConsumoCubicos = 0.2;
            pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos) + 15;
        }else{
            tarifaFija = 2.20;
            metrosCubicosConsumo = 100.2;
            costoConsumoCubicos = 0.2;
            pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos);
        }
    }

    public String obtenerTipo() {
        return tipo;
    }

    public void establecerTipo(String n) {
        tipo = n;
    }

    public double obtenerTarifaFija() {
        return tarifaFija;
    }

    public void establecerTarifaFija(double n) {
        tarifaFija = n;
    }

    public double obtenerMetrosCubicosConsumo() {
        return metrosCubicosConsumo;
    }

    public void establecerMetrosCubicosConsumo(double n) {
        metrosCubicosConsumo = n;
    }

    public double obtenerCostoConsumoCubicos() {
        return costoConsumoCubicos;
    }

    public void establecerCostoConsumoCubicos(double n) {
        costoConsumoCubicos = n;
    }
}
