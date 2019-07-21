/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author JOSE
 */
public class principal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        confederacion1 cnfd1 = new confederacion1("Confederación Sudamericana "
                + "de Fútbol ", "(CONMEBO)");
         confederacion1 cnfd2 = new confederacion1("Unión de Asociaciones "
                 + "Europeas de Fútbol","(UEFA)");
         confederacion1 cnfd3 = new confederacion1("Confederación de Fútbol de"
                 + " Norte, Centroamérica y el Caribe ","(CONCACAF)");
         confederacion1 cnfd4 = new confederacion1("Confederación Asiática de"
                 + " Fútbol", "(AFC)");
         
         federacion1 fed1 =new federacion1("Asociación del Fútbol Argentino (AFA)            ", cnfd1,"Futbol");
         federacion1 fed2 =new federacion1("Confederação Brasileira de Futebol (CBF)         ", cnfd1,"Futbol");
         federacion1 fed3 =new federacion1("United States Soccer Federation (USSF)           ", cnfd3,"Futbol");
         federacion1 fed4 =new federacion1("Federación Mexicana de Fútbol Asociación (FMF)   ", cnfd3,"Futbol");
         federacion1 fed5 =new federacion1("Real Federación Española de Fútbol (RFEF)        ", cnfd2,"Futbol");
         federacion1 fed6 =new federacion1("Federação Portuguesa de Futebol (FPF)            ", cnfd2,"Futbol");
         federacion1 fed7 =new federacion1("Korea Football Association (KFA)                 ", cnfd4,"Futbol");
         federacion1 fed8 =new federacion1("Chinese Football Association (CFA)               ", cnfd4,"Futbol");
         
        
         proyecto2.equipo1 eqp1 = new equipo1("Selecion Argentina de Futbol (Masculiino)        ", fed1,3);
         proyecto2.equipo1 eqp2 = new equipo1("Selecion Argentina de Futbol (Femenino)          ", fed1,1);
         proyecto2.equipo1 eqp3 = new equipo1("Selecion Brasileña de Futbol (Masculiino)        ", fed2,5);
         proyecto2.equipo1 eqp4 = new equipo1("Selecion Brasileña de Futbol (Femenino)          ", fed2,2);
         proyecto2.equipo1 eqp5 = new equipo1("Selecion Portuguesa de Futbol (Masculiino)       ", fed6,4);
         proyecto2.equipo1 eqp6 = new equipo1("Selecion Española de Futbol (Masculiino)         ", fed5,2);
         proyecto2.equipo1 eqp7 = new equipo1("Selecion Mexicana de Futbol (Masculiino)         ", fed4,1);
         proyecto2.equipo1 eqp8 = new equipo1("Selecion Estadounidense de Futbol (Masculiino)   ", fed3,2);
         proyecto2.equipo1 eqp9 = new equipo1("Selecion China de Futbol (Masculiino)            ", fed8,1);
         proyecto2.equipo1 eqp10 = new equipo1("Selecion China de Futbol (Femenino)             ", fed8,0);
         proyecto2.equipo1 eqp11 = new equipo1("Selecion SurKoreana de Futbol (Masculiino)      ", fed7,2);
         proyecto2.equipo1 eqp12 = new equipo1("Selecion SurKoreana de Futbol (Femenino)        ", fed7,1);
         
         proyecto2.equipo1[] equps = new proyecto2.equipo1[12];
         equps[0]=eqp1;
         equps[1]=eqp2;
         equps[2]=eqp3;
         equps[3]=eqp4;
         equps[4]=eqp5;
         equps[5]=eqp6;
         equps[6]=eqp7;
         equps[7]=eqp8;
         equps[8]=eqp9;
         equps[9]=eqp10;
         equps[10]=eqp11;
         equps[11]=eqp12;
         System.out.println("NOMBRE DEL EQUIPO\t\t\t\t\t\t\tCAMPEONATOS\t\t\tFEDERACION\t\t\t\t\t\t\t\tCONFEDERACION\n");
         for (int i = 0; i < equps.length; i++) {
            equipo1 equp = equps[i];
            System.out.printf("%s\n",equps[i]);
        }
         
         opersum op = new opersum(equps);
        op.establecer_suma_campeonato();
        
        
          System.out.printf("%s\n", op);
        /*
        System.out.println("PROVINCIA\t\t\tCIUDAD\t\t\tPOBLACION\n");
        for (int i = 0; i < equps.length; i++) {
            equipo1 cd = cds[i];
             System.out.printf("%s\n",cds[i]);
        }
        for (int i = 0; i < cds.length; i++) {
            ciudad1 cd = cds[i];
             
        }
         operprom op = new operprom(cds);
        op.establecerPromediopoblacion();
        
        System.out.printf("%s\n", op);
        
       
    }
    
}*/
        
    }
    
}
