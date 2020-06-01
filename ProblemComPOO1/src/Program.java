
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DevValmir
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();
        System.out.println("Digite o lado do driangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        
        
        System.out.println("Digite o lado do driangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
        
        double areaX = x.area();
        double areaY = y.area();
        
        System.out.println("Triangulo X: " + areaX);
        System.out.println("Triangulo Y: " + areaY);
        
        if(areaX > areaY){
            System.out.println("Maior área é a do triangulo X: "+ areaX);
            
        } 
        else
        {
            System.out.println("Maior area é a do triangulo Y: "+areaY);
        }
        
        
        
    }
    
}
