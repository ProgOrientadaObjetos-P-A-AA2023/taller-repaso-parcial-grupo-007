/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete005;

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
        /*public PagoAguaPotable aguaCasa;
        public PagoAguaPotable aguaComercio;
        public PagoLuzElectrica luzCasa;
        public PagoLuzElectrica luzComercio;
        public PagoPredial casa1;
        public PagoPredial casa2;
        public PagoTelefonoConvencional telefonoCasa;
        public PagoTelefonoConvencional telefonoFinca;*/
        
        ArrayList<Pago> listapagos = new ArrayList<>();
        Ciudad ciudad = new Ciudad("Loja");
        Persona persona = new Persona("Nahomi", "Cabrera", 19, "1150057501", ciudad);
        PagoAguaPotable aguaCasa = new PagoAguaPotable("casa", 2, 3, 10);
        PagoAguaPotable aguaComercio = new PagoAguaPotable("comercial", 5, 5, 10);
        PagoLuzElectrica luzCasa = new PagoLuzElectrica(ciudad, 5, 2, 10);
        PagoLuzElectrica luzComercio = new PagoLuzElectrica(ciudad, 4, 8, 14);
        PagoPredial casa1 = new PagoPredial(5, 5);
        PagoPredial casa2 = new PagoPredial(4, 5);
        PagoTelefonoConvencional telefonoCasa = new PagoTelefonoConvencional(5, 5, 2);
        PagoTelefonoConvencional telefonoFinca = new PagoTelefonoConvencional(4, 8, 7);
        
        listapagos.add(aguaCasa);
        listapagos.add(aguaComercio);
        listapagos.add(luzCasa);
        listapagos.add(luzComercio);
        listapagos.add(casa1);
        listapagos.add(casa2);
        listapagos.add(telefonoCasa);
        listapagos.add(telefonoFinca);
        
        BilleteraPagos pago = new BilleteraPagos(persona, "Octubre", listapagos);
        System.out.println(pago);
    }
}
