
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valmi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor para onde deseja iniciar a contagem até 100: ");
        for(int i = sc.nextInt(); i <=100; i += 2){
            System.out.println(i);
            
            
        }
        
    }
    
}
