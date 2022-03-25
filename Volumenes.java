
package estructurasdecontrol;
import java.util.*;
public class Volumenes {
    Scanner leer = new Scanner (System.in);
   public void vrect () {
       double L1,L2,H;
       double v;
        System.out.println("\nEl prisma rectangular es un poliedro cuya superficie está formada por"
                + " dos rectángulos iguales y paralelos llamados bases y por cuatro caras laterales que son también rectángulos paralelos e iguales dos a dos.\n");
        System.out.println("VOLUMEN= a*b*h\n");
        System.out.println("Siendo a y b los lados diferentes y h la altura\n");
        
        System.out.println("\nIngrese valor de un lado\n ");
        L1=leer.nextDouble();
        System.out.println("\nIngrese valor de un lado\n ");
        L2=leer.nextDouble();
        System.out.println("\nIngrese valor de la altura\n ");
        H=leer.nextDouble();
        
        v=L1*L2*H;
        
        System.out.println("\nEl volumes es: " +v);
   }
    /**
     *
     */
    public void vtria (){
        double L,H;
        double r,v1,ra,V2;
        System.out.println("El prisma triangular regular es un prisma recto que tiene como bases dos triángulos equiláteros.\n");
            System.out.println("\nVOLUMEN= raiz de 3 entre 4 (1.7320/4) L^2*h\n");
            System.out.println("\nSiendo L el lado del triangulo de la base y h la altura del prisma\n ");
            
            System.out.println("\nIngrese valor de un lado\n ");
            L=leer.nextDouble();
            System.out.println("\nIngrese valor de la altura\n ");
            H=leer.nextDouble();
            
            ra=3;
            r=Math.sqrt(ra);
            v1=r/4;
            V2=v1*L*L*H;
            
            System.out.println("\nEl volumen es: " +V2);
        }
    /**
     *
     */
    public void vcua (){
        double L,H;
        double v;
        System.out.println("El prisma cuadrangular regular es un prisma recto que tiene como bases dos cuadrados.\n");
        System.out.println("\nVOLUMEN= L^2*h\n");
        System.out.println("\nSiendo L el lado del cuadrado de la base y h la altura del prisma\n");
        
        System.out.println("\nIngresa un valor de un lado\n ");
        L=leer.nextDouble();
        System.out.println("\nIngresa un valor de la altura\n");
        H=leer.nextDouble();
        
        v=L*L*H;
        
        System.out.println("\nEl volumen es: " +v);
    }
    /**
     *
     */
    public void vcc (){
        double a;
        double v;
        System.out.println("\nVOLUMEN= a^3\n");
        System.out.println("\nSiendo a una arista del cubo\n");
        
        System.out.println("\nIngresa un valor\n");
        a=leer.nextDouble();
        
        v=a*a*a;
        
        System.out.println("\nEl volumen es: " +v);
    }
}