/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;

/**
 *
 * @author reroes
 */
public class Propiedad {
    public double costoPropiedad;

    public Propiedad(double costoPro) {
        costoPropiedad = costoPro;
    }

    public double obtenerCostoPropiedad() {
        return costoPropiedad;
    }

    public void establecerCostoPropiedad(double c) {
        costoPropiedad = c;
    }
    @Override
    public String toString() {
        String m = String.format("Costo Propiedad: %.2f/n",
                obtenerCostoPropiedad());
    return m;
    }
}
