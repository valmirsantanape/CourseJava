/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

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
        
        Retangulo retangulo = new Retangulo();
        
        System.out.println("Informe qual a largura e a altura do retangulo: ");
        System.out.println("Largura: ");
        retangulo.largura = sc.nextDouble();
        System.out.println("Altura");
        retangulo.altura = sc.nextDouble();
        System.out.println(retangulo.altura +", "+ retangulo.largura);
        
        System.out.println("Area: " + retangulo.area());
        System.out.println("Perimetro: " + retangulo.perimetro());
        System.out.println("Diagonal: " + retangulo.diagonal());
    }
    
}
