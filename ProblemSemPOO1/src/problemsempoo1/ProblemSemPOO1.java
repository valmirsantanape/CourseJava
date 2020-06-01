/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsempoo1;

import java.util.Scanner;

/**
 *
 * @author valmi
 */
public class ProblemSemPOO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;
        
        System.out.println("Digite os lados do triangulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        
        System.out.println("Digite os lados do triangulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();
        double p = (xA+xB+xC)/2;
        double areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));
        
        p = (yA+yB+yC)/2;
        double areaY = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));
        
        if(areaX > areaY){
            System.out.println("Maior área é a do triangulo X: "+ areaX);
            
        } 
        else
        {
            System.out.println("Maior area é a do triangulo Y: "+areaY);
        }
    }
    
}
