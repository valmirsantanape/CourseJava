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
                System.out.print("Eu ja peguei. Tente novamente: ");
                id = sc.nextInt();
            }
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            
            System.out.println("Salario: ");
            double salario = sc.nextDouble();
            
            list.add(new Funcionario(id, nome, salario));
        }
        // 2º parte: atualização do salrio do funcionario
        System.out.println();
        System.out.println("Digite a identificação do funcionário que terá aumento salarial: ");
        int id = sc.nextInt();
        Funcionario fun = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(fun == null){
            System.out.println("Esse id não existe! ");
        }else{
            System.out.println("Informe a porcetagem: ");
            double porcentagem = sc.nextDouble();
            fun.aumentoSalario(porcentagem);
        
    }
        //3º parte: lista de funcionarios
        System.out.println();
        System.out.println("Lista de funcionários");
        for(Funcionario obj: list){
            System.out.println("Id:" + obj.getId());
            System.out.println("Funcionário: " + obj.getNome());
            System.out.println("Salario: " + obj.getSalario());
            System.out.println("---------------------------------");
        }
        sc.close();
   }     
   public static boolean hasId(List<Funcionario> list, int id){
       Funcionario fun = list.stream().filter(x -> x.getId()==id).findFirst().orElse(null);
       return fun != null;
   } 
    
    
}
