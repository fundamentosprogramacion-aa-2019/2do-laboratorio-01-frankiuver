/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author JOSE
 */
public class equipo1 {

    private String equipo;
    private federacion1 federacion;
    private int numeroCampeonatos;

    public equipo1(String nomEquipo, federacion1 fed, int numCamp) {
        establecerNombreEquipo(nomEquipo);
        establecerFederacion(fed);
        establecerCampeonatos(numCamp);
    }

    public void establecerNombreEquipo(String nomEquipo) {
        equipo = nomEquipo;
    }

    public void establecerFederacion(federacion1 fed) {
        federacion = fed;
    }

    public void establecerCampeonatos(int numCamp) {
        numeroCampeonatos = numCamp;
    }
    //*************************************************************************

    public String obtener_nombre_equipo() {
        return equipo;
    }

    public federacion1 obtener_federacion() {
        return federacion;
    }

    public int obtenercampeonatos() {
        return numeroCampeonatos;
    }
 public String toString() {
         
        String cadena = String.format("%s\t\t\t%d\t\t\t%s\t\t\t%s\t%s",obtener_nombre_equipo(), obtenercampeonatos(),
                obtener_federacion().obtener_nombre_fed(),obtener_federacion().obtener_confed().obtener_nombre_confed(),obtener_federacion().obtener_confed().obtener_siglas());
        return cadena;
    }
}
