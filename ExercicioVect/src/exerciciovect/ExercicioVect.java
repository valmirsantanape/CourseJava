/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciovect;

import entities.Estudante;
import java.util.Scanner;

/**
 *
 * @author valmir
 */
public class ExercicioVect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        Estudante[] vect = new Estudante[10];
        System.out.println("Quantos quartos serão alugados? ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println("Estudante #" + i + ":");
            
            System.out.println("Nome do estudante: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Email do estudante: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            vect[quarto] = new Estudante(nome, email);
            
        }
        System.out.println();
        System.out.println("Busy rooms:");
        
        for (int i=0; i<10; i++) {
            if (vect[i] != null) {
            System.out.println(i + " Nome: " + vect[i].getNome());
            System.out.println("Email: " + vect.getClass());
            }
        }
        sc.close();
        
       
    }
    
}
