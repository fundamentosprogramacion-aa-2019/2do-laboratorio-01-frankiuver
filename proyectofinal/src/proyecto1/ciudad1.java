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
public class ciudad1 {

    private String nombre;
    private int poblacion;
    private provicia1 provincia;

    public ciudad1(String nombCiu, int numpobla, provicia1 prov) {
        establecerNombreCiudad(nombCiu);
        establecerNumPobla(numpobla);
        establecerPovincia(prov);
    }

    ciudad1(ciudad1[] cds) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void establecerNombreCiudad(String nombCiu) {
        nombre = nombCiu;
    }

    public void establecerNumPobla(int numpobla) {
        poblacion = numpobla;
    }

    public void establecerPovincia(provicia1 prov) {
        provincia = prov;
    }
//***************************************************************************

    public String obtenerNombreCiudad() {
        return nombre;
    }

    public int obtenerNunmeroPoblacion() {
        return poblacion;
    }

    public provicia1 obtenerProvincia() {
        return provincia;
    }
    public String toString() {
         
        String cadena = String.format("%s\t\t\t%d\t\t\t%s",obtenerNombreCiudad(), obtenerNunmeroPoblacion(),
                obtenerProvincia()
                .obtenerNombreProv());
        return cadena;
    }
}
