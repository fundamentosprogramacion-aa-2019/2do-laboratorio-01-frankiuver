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
public class depmunicipal1 {

    private String nombre;
    private areamunicip1 area;
    private double presupuesto;
    private persona1 jefe;

    public depmunicipal1(String nbdep, areamunicip1 aream, double pres, 
            persona1 jf) {
        establcer_nombre_dep(nbdep);
        establcer_area_muni(aream);
        establcer_presupuesto(pres);
        establcer_jefe(jf);
    }

    public void establcer_nombre_dep(String nbdep) {
        nombre = nbdep;
    }

    public void establcer_area_muni(areamunicip1 aream) {
        area = aream;
    }

    public void establcer_presupuesto(double pres) {
        presupuesto = pres;
    }

    public void establcer_jefe(persona1 jf) {
        jefe = jf;
    }
//**************************************************************

    public String obtener() {
        return nombre;
    }

    public areamunicip1 obtener_area_munici() {
        return area;
    }

    public double obtener_presupuesto() {
        return presupuesto;
    }

    public persona1 obtener_jefe() {
        return jefe;
    }

}
