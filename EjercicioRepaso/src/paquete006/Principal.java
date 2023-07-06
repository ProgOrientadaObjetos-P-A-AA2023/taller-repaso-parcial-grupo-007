/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete006;

import java.util.ArrayList;
import paquete001.Persona;
import paquete002.Ciudad;
import paquete003.BilleteraPagos;
import paquete004.*;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Pago> listapagos = new ArrayList<>();
        Ciudad ciudad = new Ciudad("Loja");
        Persona persona = new Persona("Nahomi", "Cabrera", 19, "1150057501", ciudad);
        
        DatosAgua d1 = new DatosAgua();
        DatosLuz d2 = new DatosLuz();
        DatosPropiedades d3 = new DatosPropiedades();
        DatosTelefono d4 = new DatosTelefono();
        
        ArrayList<Pago> aux = convertir("datosComerciales", d1.datosComerciales());        
        for (int i=0; i<aux.size(); i++){
            listapagos.add(aux.get(i));
        }
        
        ArrayList<Pago> aux2 = convertir("datosCasas", d1.datosCasas());        
        for (int i=0; i<aux2.size(); i++){
            listapagos.add(aux2.get(i));
        }
        
        ArrayList<Pago> aux3 = convertir("datosLoja", d2.datosLoja());        
        for (int i=0; i<aux3.size(); i++){
            listapagos.add(aux3.get(i));
        }
        
        ArrayList<Pago> aux4 = convertir("datosGeneral", d2.datosGeneral());        
        for (int i=0; i<aux4.size(); i++){
            listapagos.add(aux4.get(i));
        }
        
        ArrayList<Pago> aux5 = convertir("datos", d3.datos());        
        for (int i=0; i<aux5.size(); i++){
            listapagos.add(aux5.get(i));
        }
        
        ArrayList<Pago> aux6 = convertir("datos", d4.datos());        
        for (int i=0; i<aux6.size(); i++){
            listapagos.add(aux6.get(i));
        }
        
        BilleteraPagos pago = new BilleteraPagos(persona, "Julio", listapagos);
        for (int i =0 ; i<pago.obtenerPagos().size(); i++) {
            pago.obtenerPagos().get(i).calcularPago();            
        } 
        pago.calcularGastoPagos();
        
        System.out.println(pago);
    }
    
    public static ArrayList<Pago> convertir(String nombre, double [][] matriz) {
        double valor1;
        double valor2;
        double valor3;
        ArrayList<Pago> listapagos = new ArrayList<>();
        Pago p1;
        
        if (matriz[0].length==2) {
            for (int i=0; i<matriz.length; i++) {
                valor1 = matriz[i][0];
                valor2 = matriz[i][1];
                p1 = new PagoPredial(valor1, valor2);
                listapagos.add(p1);
            }
            return listapagos;            
        }
        
        for (int i=0; i<matriz.length; i++) {
            valor1 = matriz[i][0];
            valor2 = matriz[i][1];
            valor3 = matriz[i][2];
            if (nombre.equals("datosComerciales")) {
                p1 = new PagoAguaPotable("comercial", valor1, valor2, valor3);
                listapagos.add(p1);
            }
            if (nombre.equals("datosCasas")) {
                p1 = new PagoAguaPotable("casa", valor1, valor2, valor3);
                listapagos.add(p1);
            }
            if (nombre.equals("datosLoja")) {
                Ciudad ciudad = new Ciudad("Loja");
                p1 = new PagoLuzElectrica(ciudad, valor1, valor2, valor3);
                listapagos.add(p1);
            }
            if (nombre.equals("datosGeneral")) {
                Ciudad ciudad = new Ciudad("Loja");
                p1 = new PagoLuzElectrica(ciudad, valor1, valor2, valor3);
                listapagos.add(p1);
            }
            if (nombre.equals("datos")) {
                p1 = new PagoTelefonoConvencional(valor1, valor2, valor3);
                listapagos.add(p1);
            }
        }
        return listapagos;    
    } 
}
