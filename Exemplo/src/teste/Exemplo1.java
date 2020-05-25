/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.Scanner;

/**
 *
 * @author valmi
 */
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int x = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int y = sc.nextInt();
        int soma = x+y;
        
        System.out.println("A soma dos numeros digitados é " + soma);
        
        
    }
    
}
