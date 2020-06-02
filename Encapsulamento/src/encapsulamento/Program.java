/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento;

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
        
        
        
        System.out.println("Entre com produto: ");
        System.out.println("Nome: ");
        String nome = sc.next();
        
        System.out.println("Preço: ");
        double price = sc.nextDouble();
        
        System.out.println("Quantidade: ");
        int quantity = sc.nextInt();
        
        Produto product = new Produto(nome, price, quantity);
        System.out.println("Produto: " + product.getNome());
        product.setNome("Cumputer");
        System.out.println("Produto atualizando: " + product.getNome());
        
        
        System.out.println("Adcione mais produtos no estoque: ");
        int quantidade = sc.nextInt();
        product.addProduct(quantidade);
        
        System.out.println();
        System.out.println("Produto atualizando: " + product);
        
        System.out.println("Retirar produtos do estoque: ");
        quantidade = sc.nextInt();
        product.removeProduct(quantidade);
        
        System.out.println();
        System.out.println("Produto atualizando: " + product);
    }
     
}
