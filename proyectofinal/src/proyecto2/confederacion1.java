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
 public z obtener(){return x;}*/
public class confederacion1 {

    private String nombre;
    private String siglas;

    public confederacion1(String nconf, String sig) {
        establcer_nombre_confed(nconf);
        establcer_siglas(sig);
    }

    public void establcer_nombre_confed(String nconf) {
        nombre = nconf;
    }

    public void establcer_siglas(String sig) {
        siglas = sig;
    }

    public String obtener_nombre_confed() {
        return nombre;
    }

    public String obtener_siglas() {
        return siglas;
    }
public String toString() {
         
        String cadena = String.format("%s\t\t\t%s",obtener_nombre_confed(),obtener_siglas());
        return cadena;
    }
}
