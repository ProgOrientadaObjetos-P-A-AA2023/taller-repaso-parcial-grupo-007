/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete006;

import java.util.ArrayList;
import paquete004.*;
import paquete001.*;
import paquete002.*;
import paquete003.*;

/**
 *
 * @author D E L L
 */
public class Principal2 {

    public static void main(String[] args) {
        ArrayList<Pago> lista = new ArrayList();
        Ciudad c1 = new Ciudad("Quito");
        Ciudad c2 = new Ciudad("Loja");
        DatosAgua d1 = new DatosAgua();
        DatosLuz d2 = new DatosLuz();
        DatosPropiedades d3 = new DatosPropiedades();
        DatosTelefono d4 = new DatosTelefono();

        Persona persona = new Persona("Lionel", "Andres", 36, "110329093", c1);

        double[][] datosComerciales = d1.datosComerciales();

        for (int i = 0; i < datosComerciales.length; i++) {
            double tarifa = datosComerciales[i][0];
            double metrosConsumo = datosComerciales[i][1];
            double costoConsumo = datosComerciales[i][2];//como el taller 11 de los menus
            String tipo = "comercial";
            Pago p1 = new PagoAguaPotable(tipo, tarifa, metrosConsumo, costoConsumo);
            lista.add(p1);
        }

        double[][] datosCasas = d1.datosCasas();
        for (int i = 0; i < datosCasas.length; i++) {
            double tarifa = datosCasas[i][0];
            double metrosConsumo = datosCasas[i][1];
            double costoConsumo = datosCasas[i][2];
            String tipo = "normal";
            Pago p1 = new PagoAguaPotable(tipo, tarifa, metrosConsumo, costoConsumo);
            lista.add(p1);
        }

        double[][] datosLoja = d2.datosLoja();
        for (int i = 0; i < datosLoja.length; i++) {
            double tarifa = datosLoja[i][0];
            double consumo = datosLoja[i][1];
            double costo = datosLoja[i][2];
            Pago p1 = new PagoLuzElectrica(c2, tarifa, consumo, costo);
            lista.add(p1);
        }

        double[][] datosGeneral = d2.datosGeneral();
        for (int i = 0; i < datosGeneral.length; i++) {
            double tarifa = datosGeneral[i][0];
            double consumo = datosGeneral[i][1];
            double costo = datosGeneral[i][2];
            Pago p1 = new PagoLuzElectrica(c1, tarifa, consumo, costo);
            lista.add(p1);
        }

        double[][] datosPropiedades = d3.datos();
        for (int i = 0; i < datosPropiedades.length; i++) {
            double costoP = datosPropiedades[i][0];
            //Propiedad propiedad1 = new Propiedad(costoP);
            double porcent = datosPropiedades[i][1];
            Pago p1 = new PagoPredial(/*propiedad1,*/costoP, porcent);
            lista.add(p1);
        }

        double[][] datosTelefono = d4.datos();
        for (int i = 0; i < datosTelefono.length; i++) {
            double tarifa = datosTelefono[i][0];
            double consumo = datosTelefono[i][1];
            double costo = datosTelefono[i][2];
            Pago p1 = new PagoTelefonoConvencional(tarifa, consumo, costo);
            lista.add(p1);
        }
        
        for (Pago lista1 : lista) {
            lista1.calcularPago();
        }

        BilleteraPagos pago = new BilleteraPagos(persona, "Marzo", lista);

        pago.calcularGastoPagos();
        System.out.println(pago);
    }
}
