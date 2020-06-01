
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valmi
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Triangulo x = new Triangulo();
        System.out.println("Digite o lado do driangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        
        Triangulo y = new Triangulo();
        System.out.println("Digite o lado do driangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
        double p = (x.a+x.b+x.c)/2;
        double areaX = Math.sqrt(p*(p-x.a)*(p-x.b)*(p-x.c));
        
        p = (y.a+y.b+y.c)/2;
        double areaY = Math.sqrt(p*(p-y.a)*(p-y.a)*(p-y.c));
        
        if(areaX > areaY){
            System.out.println("Maior área é a do triangulo X: "+ areaX);
            
        } 
        else
        {
            System.out.println("Maior area é a do triangulo Y: "+areaY);
        }
        
        
        
    }
    
}
