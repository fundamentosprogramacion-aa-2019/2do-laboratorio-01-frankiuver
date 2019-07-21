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

public class persona1 {

    private String nombre;
    private String apellido;
    private int edad;

    public persona1(String nbpers, String apll, int edd) {
        establcer_nombre_pers(nbpers);
        establcer_apellido_pers(apll);
        establcer_edad(edd);
    }

    public void establcer_nombre_pers(String nbpers) {
        nombre = nbpers;
    }

    public void establcer_apellido_pers(String apll) {
        apellido = apll;
    }

    public void establcer_edad(int edd) {
        edad = edd;
    }

    //*************************************************************

    public String obtener_nombre_pers() {
        return nombre;
    }

    public String obtener_apellido_pers() {
        return apellido;
    }

    public int obtener_edad_pers() {
        return edad;
    }

}
