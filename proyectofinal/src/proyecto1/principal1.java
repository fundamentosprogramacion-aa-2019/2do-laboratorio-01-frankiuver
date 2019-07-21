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
public class principal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        region rg1 = new region("Costa");
        region rg2 = new region("Sierra");
        region rg3 = new region("Oriente");
        
        provicia1 prov1 = new provicia1("Pichincha", rg2);
        provicia1 prov2 = new provicia1("loja", rg2);
        provicia1 prov3 = new provicia1("Guayas", rg1);
        provicia1 prov4 = new provicia1("El oro", rg1);
        provicia1 prov5 = new provicia1("Zamora Ch.", rg3);
        
        proyecto1.ciudad1 c1 = new ciudad1("Guayaquil", 1985379, prov3);
        proyecto1.ciudad1 c2 = new ciudad1("Quito     ", 1399814, prov1);
        proyecto1.ciudad1 c3 = new ciudad1("Loja      ", 118532, prov2);
        proyecto1.ciudad1 c4 = new ciudad1("Machala   ",204578, prov4);
        proyecto1.ciudad1 c5 = new ciudad1("Duran     ", 174531, prov3);
        proyecto1.ciudad1 c6 = new ciudad1("Milagro   ", 113440, prov3);
        proyecto1.ciudad1 c7 = new ciudad1("Sangolquí ", 56794, prov1);
        proyecto1.ciudad1 c8 = new ciudad1("Pasaje    ",45215, prov4);
        proyecto1.ciudad1 c9 = new ciudad1("Zamora    ",10355, prov5);
        proyecto1.ciudad1 c10 = new ciudad1("Zamora   ",10355, prov5);
        
       // manejoconstructoresdos.Entrenador entr1 = new manejoconstructoresdos.Entrenador("Luis Soler", 59,
        //        "Fútbol", 9500, equip1);
        
      proyecto1.ciudad1[] cds = new proyecto1.ciudad1[10];
        cds[0] = c1;
        cds[1] = c2;
        cds[2] = c3;
        cds[3] = c4;
        cds[4] = c5;
        cds[5] = c6;
        cds[6] = c7;
        cds[7] = c8;
        cds[8] = c9;
        cds[9] = c10;
        System.out.println("PROVINCIA\t\t\tCIUDAD\t\t\tPOBLACION\n");
        for (int i = 0; i < cds.length; i++) {
             System.out.printf("%s\n",cds[i]);
        }
        
         operprom op = new operprom(cds);
        op.establecerPromediopoblacion();
        
        System.out.printf("%s\n", op);
        
       
    }
    
}
