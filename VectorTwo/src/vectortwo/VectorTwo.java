/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectortwo;

import java.util.Scanner;

/**
 *
 * @author valmi
 */
public class VectorTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a quantidade de produtos que serão listados: ");
        int n = sc.nextInt();
        //"n" indica quantos produtos serão lidos 
        Product[] vect = new Product[n]; // vetor do tipo classe
        
        for(int i = 0; i<n; i++){
            sc.nextLine();
            System.out.println("Nome do produto: ");
            String name = sc.nextLine();
            System.out.println("Preço do produto: ");
            double price = sc.nextDouble();
            
            vect[i] = new Product(name, price);
        }
        
        double sum = 0; 
        for(int i=0; i<n; i++){
            sum += vect[i].getPrice();
         }
        double avg = sum/n;
        System.out.println("Media dos preços: " +avg);
        sc.close();
    }
    
}
