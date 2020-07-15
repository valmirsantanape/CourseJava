/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author valmi
 */
public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        
        
        try {
          sc = new Scanner(file);
          
          while(sc.hasNextLine()){
              System.out.println(sc.nextLine());
          }
          
        } catch (FileNotFoundException e) {
            System.out.println("Error em abrir arquivo: " + e.getMessage());
        }
        
        finally{
            if(sc!=null){
                sc.close();
            }
        }
    }
    
}
