/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenu1u2;
import java.util.Scanner;
/**
 *
 * @author labcca
 */
public class ExamenU1U2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner total = new Scanner(System.in);
        System.out.println("Ingresa el costo 1");
        double p1 = total.nextDouble();
        total.nextLine();
                    
        System.out.println("Ingresa el costo 2");
        double p2 = total.nextDouble();
        total.nextLine();
        
        System.out.println("Ingresa el costo 3");
        double p3 = total.nextDouble();
        total.nextLine();
        
        double des1 = (p1*30)/100;
        double des2 = (p2*65)/100;
        double des3 = (p3*15)/100;
        
        double t1 = p1-des1;
        double t2 = p2-des2;
        double t3 = p3-des3;
        
        System.out.println("El precio final del videojuego1 es: " + t1);
        System.out.println("El precio final del videojuego2 es: " + t2);
        System.out.println("El precio final del videojuego3 es: " + t3);
        
        total.close();
    }
    
}
