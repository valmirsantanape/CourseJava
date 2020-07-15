 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.InputMismatchException;

import java.util.Scanner;

/**
 *
 * @author valmi
 */
public class Program {
 
    
    
    
    public static void main(String[] args) {
        metodo1();
       
       
        
        
    }
    public static void metodo1(){
        
        System.out.println("Incio do metodo 1");
        metodo2();
        System.out.println("Fim do metodo 1");
    
    }

    
    
    public static void metodo2(){
        System.out.println("Inicio do  metodo 2");

        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int posicao = sc.nextInt();
            System.out.println(vect[posicao]);
        
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posicao invalida. ");
            e.printStackTrace();
            sc.next();
        }
        catch(InputMismatchException e){
            System.out.println("Input error");
            
        }
        System.out.println("Fim do metodo 2");
        
        System.out.println("Fim da execução");
        
        sc.close();
        
        
    }
}
