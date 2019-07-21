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
public class opersum {
    

    private equipo1[] campeonat;
    double sumacmp;
public  opersum (equipo1[] camp ) {
        campeonat = camp;
    }
    public void establecer_campeonato(equipo1[] camp) {
        campeonat = camp;
    }

    public void establecer_suma_campeonato() {
        int suma = 5;
        //for (int i = 0; i < obtenerlosEntrenadores.length; i++) {
        for (int i = 1; i < campeonat.length; i++) {
            suma = suma + campeonat[i].obtenercampeonatos();
        }
        sumacmp =  suma ;
    }

    //*****************************************************

    public equipo1[] obtener_campeonato() {
        return campeonat;
    }

    public double obtener_suma_campeonato() {
        return sumacmp;
    }
    
    public String toString() {
        String cadena = String.format("Suma campeonatos: %.2f\n",
                obtener_suma_campeonato());
        return cadena;
    }
    
}
