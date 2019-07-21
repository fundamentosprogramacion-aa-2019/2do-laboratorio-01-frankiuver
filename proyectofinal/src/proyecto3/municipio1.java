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
public class municipio1 {

    private String nombre;
    private ciudad2 ciudad;

    public municipio1(String x, ciudad2 xy) {
        establcer_nombre_municipio(x);
        establcer_ciudad(xy);
    }

    public void establcer_nombre_municipio(String x) {
        nombre = x;
    }

    public void establcer_ciudad(ciudad2 xy) {
        ciudad = xy;
    }

    //*************************************************************************

    public String obtener_nombre_municipio() {
        return nombre;
    }

    public ciudad2 obtener_nombre_ciudad() {
        return ciudad;
    }

}
