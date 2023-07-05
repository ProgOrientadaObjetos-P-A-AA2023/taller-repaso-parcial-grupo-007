/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

/**
 *
 * @author SALA H
 */
public abstract class Pago {
    protected double pago;

    public Pago() {
        pago = 0;
    }

    public double obtenerPago() {
        return pago;
    }

    public abstract void calcularPago();
    
    @Override
    public String toString () {
        String cadena = String.format("Valor Pago Final: %.2f\n",
                obtenerPago());
        return cadena;
    }
}
