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
public class provicia1 {

    private String nombProv;
    private region region;

    public provicia1(String nprov, region reg) {
        establecerNombreProv(nprov);
        establecerRegion(reg);
    }

    public void establecerNombreProv(String nprov) {
        nombProv = nprov;
    }

    public void establecerRegion(region reg) {
        region = reg;
    }

    public String obtenerNombreProv() {
        return nombProv;
    }

    public String obtenerRegion() {
        return nombProv;
    }

}
