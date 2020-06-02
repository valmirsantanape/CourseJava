/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convercao;

import java.util.Scanner;
import util.CurrencyConverter;

/**
 *
 * @author valmi
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual o valor do Dolar?");
        double dolarprice = sc.nextDouble();
        System.out.println("Considere a combrança de 6% de IOF");

        
        System.out.println("Quantos dolares você deseja comprar? ");
        double amount = sc.nextDouble();
        double result = CurrencyConverter.dolarToReal(amount, dolarprice);
        
        System.out.println("Voce pagará R$ "+ result);
        
        
    }
    
}
