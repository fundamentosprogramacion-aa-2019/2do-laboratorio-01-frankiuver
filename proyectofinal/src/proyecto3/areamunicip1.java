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
public class areamunicip1 {

    private String nombre;
    private persona1 directora;
    private municipio1 municipio;

    public areamunicip1(String nombre, persona1 directora, municipio1 municipio,
            String nbare, persona1 nbdir, municipio1 muni) {
        establcer_nombre(nbare);
        establcer_directora(nbdir);
        establcer_mucipio(muni);
    }

    public void establcer_nombre(String nbare) {
        nombre = nbare;
    }

    public void establcer_directora(persona1 nbdir) {
        directora = nbdir;
    }

    public void establcer_mucipio(municipio1 muni) {
        municipio = muni;
    }

    //************************************************************************

    public String obtener_nombre() {
        return nombre;
    }

    public persona1 obtener_directora() {
        return directora;
    }

    public municipio1 obtener_municipio() {
        return municipio;
    }

}
