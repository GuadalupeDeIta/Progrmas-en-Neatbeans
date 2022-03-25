package estructurasdecontrol;
import java.util.*;

public class CalculoVolumen {
    public static void main (String[]args){
        Scanner leer = new Scanner (System.in);
        String prisma;
        System.out.println("IRMA GUADALUPE\n");
        System.out.println("\nEste programa es para calcular los volumenes de diferentes prismas\n");
        
        /* DecisiónSimple simple = new DecisiónSimple ();
        ifposneg.ifposneg();*/
        Volumenes vrect = new Volumenes ();
        Volumenes vtria = new Volumenes ();
        Volumenes vcua = new Volumenes ();
        Volumenes vcc = new Volumenes ();
        
        
        System.out.println("\nMENU PRISMAS\n");
        System.out.println(" 1.RECTANGULAR\n 2.TRIANGULAR\n 3.CUADRANGULAR\n 4.CUBO\n");
        
        System.out.println("\nElige un prisma\n");
        prisma=leer.nextLine();
        System.out.println("\n ");
        
        switch (prisma){
            case "1": case "rectangular": case "RECTANGULAR": case "prisma rectangular":
              vrect.vrect();   
              break;
            case "2": case "triangular": case "TRIANGULAR": case "prisma triangular":
               vtria.vtria();
               break;
            case "3": case "cuadrangular": case "CUADRANGULAR": case "prisma cuadrangular":
                vcua.vcua();
                break;
            case "4": case "cubo": case "CUBO": 
                vcc.vcc();
                break;
        }
       
        
    }
    
}
