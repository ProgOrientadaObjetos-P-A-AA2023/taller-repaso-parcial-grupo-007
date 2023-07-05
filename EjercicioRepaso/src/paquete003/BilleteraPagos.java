/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete003;

import java.util.ArrayList;
import paquete001.Persona;
import paquete004.Pago;
import paquete004.PagoAguaPotable;
import paquete004.PagoLuzElectrica;
import paquete004.PagoPredial;
import paquete004.PagoTelefonoConvencional;

/**
 *
 * @author reroes
 */
public class BilleteraPagos {
    private Persona persona;
    private double gastoPagos;
    private String mes;
    private ArrayList<Pago> pagos;
    
    /*public PagoAguaPotable aguaCasa;
    public PagoAguaPotable aguaComercio;
    public PagoLuzElectrica luzCasa;
    public PagoLuzElectrica luzComercio;
    public PagoPredial casa1;
    public PagoPredial casa2;
    public PagoTelefonoConvencional telefonoCasa;
    public PagoTelefonoConvencional telefonoFinca;*/

    public BilleteraPagos(Persona pe, String m, ArrayList<Pago> p) {
        persona = pe;
        mes = m;
        pagos = p;
    }

    public Persona obtenerPersona() {
        return persona;
    }

    public void establecerPersona(Persona n) {
        persona = n;
    }

    public double obtenerGastoPagos() {
        return gastoPagos;
    }

    public void calcularGastoPagos() {
        for (int i =0 ; i<pagos.size(); i++) {
            gastoPagos+=pagos.get(i).obtenerPago();
        }
    }

    public String obtenerMes() {
        return mes;
    }

    public void establecerMes(String n) {
        mes = n;
    }

    public ArrayList<Pago> obtenerPagos() {
        return pagos;
    }

    public void establecerPagos(ArrayList<Pago> n) {
        pagos = n;
    }    
    
    @Override
    public String toString(){
        String cadena = String.format("\tREPORTE:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Edad: %d\n"
                + "ID: %s\n"
                + "Ciudad: %s\n"
                + "Mes: %s\n"
                + "LISTA DE PAGOS\n", obtenerPersona().obtenerNombre(), 
                obtenerPersona().obtenerApellido(),
                obtenerPersona().obtenerEdad(),
                obtenerPersona().obtenerCedula(),
                obtenerPersona().obtenerCiudad().obtenerNombreCiudad(),
                obtenerMes());
        
        for (int i =0 ; i<pagos.size(); i++) {
            cadena = String.format("%s\n%s\n", cadena, obtenerPagos().get(i));
        }
        
        cadena = String.format("%s\nGatos pagos: %.2f\n", 
                cadena, 
                obtenerGastoPagos());
        
        return cadena;
    }
    
}
