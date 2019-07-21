
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;
/*

 private String x;
 private int x;
 private double x;
 private z x;

 public void establcer(String x){=x;}
 public void establcer(int x){=x;}
 public void establcer(double x){=x;}
 public void establcer(z x){=x;}

 public String obtener(){return x;}
 public int obtener(){return x;}
 public double obtener(){return x;}
 public z obtener(){return x;} */

public class federacion1 {

    private String nombre;
    private confederacion1 confederacion;
    private String deporte;

    public federacion1(String nombfed, confederacion1 confed, String dep) {
        establcer_nombre_fed(nombfed);
        establcer_confed(confed);
        establcer_deporte(dep);
    }

    public void establcer_nombre_fed(String nombfed) {
        nombre = nombfed;
    }

    public void establcer_confed(confederacion1 confed) {
        confederacion = confed;
    }

    public void establcer_deporte(String dep) {
        deporte = dep;
    }

    //**********************************************************************

    public String obtener_nombre_fed() {
        return nombre;
    }

    public confederacion1 obtener_confed() {
        return confederacion;
    }

    public String obtener_deporte() {
        return deporte;
    }
    public String toString() {
         
        String cadena = String.format("%s\t\t\t%s\t\t\t%s",obtener_nombre_fed(),obtener_confed().obtener_nombre_confed(),obtener_deporte());
        return cadena;
    }

}
