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
      
        metodo2();
       
        
        
    }
    public static void metodo2(){
         Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int posicao = sc.nextInt();
            System.out.println(vect[posicao]);
        
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posicao invalida. ");
        }
        catch(InputMismatchException e){
            System.out.println("Input error");
            
        }
        
        System.out.println("Fim da execução");
        
        sc.close();
        
        
    }
}
