/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        List<String> list = new ArrayList<>();
        //ArrayList é uma classe que implementa a interface List.
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("Marco");
        
        list.add(2, "Antonio");
        
        System.out.println(list.size());
        
        
        for (String x : list){
            System.out.println(x);
        }
        System.out.println("-----------------------------------------");
        list.removeIf(x -> x.charAt(0) =='M');
        
        
        for (String x : list){
        System.out.println(x);
        }
        System.out.println("-----------------------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Bob: " + list.indexOf("Marco"));
        
        System.out.println("-----------------------------------------");
        
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for(String x : result){
            System.out.println(x);
        }
    }

    
    
}
