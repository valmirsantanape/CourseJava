/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciolist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author valmi
 */
public class ExercicioList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        List<Funcionario> list = new ArrayList<>();
        //1º Leitura de dados:
        System.out.println("Quantos funcionários serão registrados? ");
        int n = sc.nextInt();
        
        for(int i = 1; i<=n; i++){
            System.out.println();
            System.out.println("Funcionário #" + i + ":");
            
            System.out.println("Id: ");
            int id = sc.nextInt();            
            while(hasId(list, id)){
                System.out.println("Eu ja peguei. Tente novamente: ");
                id = sc.nextInt();
            }
            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Salario: ");
            double salario = sc.nextDouble();
            
            list.add(new Funcionario(id, nome, salario));
        }
        
   }     
   public static boolean hasId(List<Funcionario> list, int id){
       Funcionario fun = list.stream().filter(x -> x.getId()==id).findFirst().orElse(null);
       return fun != null;
   } 
    
    
}
