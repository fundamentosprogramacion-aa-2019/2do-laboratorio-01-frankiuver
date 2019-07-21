/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;

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
 public z obtener(){return x;}
 */
public class ciudad2 {

    private String nombre;
    private String provincia;

    public ciudad2(String x, String xy) {
        establcer_nombre_ciudad(x);
        establcer_provicia(xy);
    }

    public void establcer_nombre_ciudad(String x) {
        nombre = x;
    }

    public void establcer_provicia(String xy) {
        nombre = xy;
    }

    public String obtener() {
        return nombre;
    }

    public String obtener_ciudad() {
        return provincia;
    }
}
