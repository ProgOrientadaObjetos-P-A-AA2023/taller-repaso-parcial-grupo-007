/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;

/**
 *
 * @author reroes
 */
public class Ciudad {

    String nombreCiudad;

    public Ciudad(String n) {
        nombreCiudad = n;
    }

    public String obtenerNombreCiudad() {
        return nombreCiudad;
    }

    public void establecerNombreCiudad(String n) {
        nombreCiudad = n;
    }

    @Override
    public String toString() {
        String m = String.format("Nombre Ciudad: %s/n",
                obtenerNombreCiudad());
    return m;
    }
}
