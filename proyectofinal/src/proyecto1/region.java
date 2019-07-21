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
public class region {

    private String nombReg;

    public region(String nreg) {
        establecernombre(nreg);

    }

    public void establecernombre(String nreg) {
        nombReg = nreg;
    }

    public String obtenernombre() {
        return nombReg;
    }

}
