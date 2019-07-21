/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author JOSE
 */
public class operprom {

    private ciudad1[] poblacion;
    double promediopoblacion;
public  operprom (ciudad1[] pobl ) {
        poblacion = pobl;
    }
    public void establecerLapoblacion(ciudad1[] pobl) {
        poblacion = pobl;
    }

    public void establecerPromediopoblacion() {
        int suma = 0;
        //for (int i = 0; i < obtenerlosEntrenadores.length; i++) {
        for (int i = 0; i < poblacion.length; i++) {
            suma = suma + poblacion[i].obtenerNunmeroPoblacion();
        }
        promediopoblacion = (double) suma / poblacion.length;
    }

    //*****************************************************

    public ciudad1[] obtenerLosEntrenadores() {
        return poblacion;
    }

    public double obtenerPromediopoblacion() {
        return promediopoblacion;
    }
    
    public String toString() {
        String cadena = String.format("Promedio Poblacion: %.2f\n",
                obtenerPromediopoblacion());
        return cadena;
    }
}
