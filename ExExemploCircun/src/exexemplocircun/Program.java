/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exexemplocircun;

import static exexemplocircun.Calculator.PI;
import static exexemplocircun.Calculator.circunferencia;
import static exexemplocircun.Calculator.volume;
import java.util.Scanner;

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
        
        System.out.println("Entre com o raio: ");
        double raio = sc.nextDouble();
        double c = circunferencia(raio);
        double v = volume(raio);
        
        System.out.println("Circunferencia: "+ c);
        System.out.println("Volume: "+ v);
        System.out.println("PI: "+ PI);
        
        
    }
    
    
}
