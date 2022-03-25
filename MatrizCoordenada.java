package estructurasdecontrol;
import java.util.*;

public class MatrizCoordenada {
    public static void main (String[]args) throws InterruptedException{
        Scanner leer=new Scanner(System.in);
    
        int u=0,i=0,x=0,y=0,matriz[][];
        String letras;
        
matriz=new int [2][5];
matriz [0][0]=1234;
matriz [0][1]=12343;
matriz [0][2]=12345;
matriz [0][3]=12345;
matriz [0][4]=12346;
matriz [1][0]=12346;
matriz [1][1]=12347;
matriz [1][2]=12347;
matriz [1][3]=12348;
matriz [1][4]=12348;
        System.out.println("IRMA GUADALUPE\n");
        System.out.println("Este programa te pide usuario y contraseña para ingresar a el programa y se pueda ejecutar, el programa trata de oprimir un boton y si ese boton cuenta con instrucciones se empleen y hagan lo que le pida, es un programa de coordenadas, que incrementa y o decrementa al igual que x\n");
System.out.println("Ingresa un usuario y contraseña ");
        matriz[u][u]=leer.nextInt();
        
            
            if (matriz[u][u]==1234 ){
            System.out.println("\nUsuario y contraseña correctos ");  
            }
            
        else{ 
            System.out.println("Contraseña incorrecta");
            System.out.println("Ingresa un usuario y contraseña ");
        matriz[u][u]=leer.nextInt();
            i++;
    }
        
      
        
        
        
        
        
        
     
         System.out.println("\n  ");
            System.out.println("MENU");
            Thread.sleep(1000);
          System.out.println("\nW= incrementa y en 1\n S= decrementar y en 1\n D incrementar x en 1\n A= decrementae x en 1\n Q= encender/apagar motor\n M= mostar menu\n ");
            Thread.sleep(1000);
          System.out.println("\nOprime la leta Q para encender ");
            letras=leer.next();
            Thread.sleep(1000);
            System.out.println("\n ");
            
            
            
            switch (letras){
                case "q": case "Q":
                System.out.println("PROGRAMA ENCENDIDO ");
                break;
                default:
                    System.out.println("PROGRAMA NO INICIALIZADO");
                    System.exit(0);
                    break;
                
            }
            
            
            
     
         
          
            
           
            
do {
        
        
           
           
            Thread.sleep(1000);
            
          
            System.out.println("\n ");
            System.out.println("(x,y)");
            System.out.println(x+","+y);
            Thread.sleep(1000);
            System.out.println("\n ");
            System.out.println("\nOprime una letra\n");
            letras=leer.next();
            Thread.sleep(1000);
            System.out.println("\n ");
            
            
        switch (letras){
            case "W": case "w":
                System.out.println("y incrementa 1");
                System.out.println("(x,y)");
                y++;
                System.out.println(x+","+y);
               
                
                break;
            case "S": case"s":
                 System.out.println("y decrementa en 1");
                System.out.println("(x,y)");
                y--;
                System.out.println(x+","+y);
               
                break;
            case "D": case "d":
                 System.out.println("x incrementa en 1");
                System.out.println("(x,y)");
                x++;
                System.out.println(x+","+y);
                
                break;
            case "A": case "a":
                 System.out.println("x decrementa en 1");
                System.out.println("(x,y)");
                x--;
                System.out.println(x+","+y);
                
                break;
            case "Q": case "q":
             System.out.println("se apago el motor");
                    System.exit(0);
                break;
            case "M": case "m":
                System.out.println("MENU\n");
                 System.out.println("\nW= incrementa y en 1\n S= decrementar y en 1\n D incrementar x en 1\n A= decrementae x en 1\n Q= encender/apagar motor\n M= mostar menu\n ");
                 break;
                 
        }
         if(y==50 & x==50){
                   System.out.println("PRIMERA SEÑAL");
                }
         if (x==100 & y==50){
             System.out.println("SEGUNDA SEÑAL");
         }
         if (x==0 & y==100){
             System.out.println("TERCERA SEÑAL");
         }
         if (x==150 | x==-150){
            System.out.println("SE PASO EL LIMITE");
            System.exit(0);
         }
        if (y==100 | y==-100 ){
            System.out.println("SE PASO EL LIMITE");
            System.exit(0);
        }
        
        


        } 






while (i<=3);
        if (i==3){
             System.out.println("Acceso denegado intentalo más tarde");
        }
       
    }
    }
   
    



