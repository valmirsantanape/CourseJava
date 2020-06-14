/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayaprimorado;

import java.util.ArrayList;

/**
 *
 * @author valmi
 */
public class ArrayAprimorado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Valmir");
        nomes.add("Ana");
        System.out.println("toString: "+nomes.toString());
        //metodo que exibe a lista
        System.out.println("get: "+nomes.get(0));
        //metodo get retorna o item da lista na posiçao indicada como paramentro.
        System.out.println("isEmpty: "+nomes.isEmpty());
        System.out.println("contains: "+nomes.contains("Valmir"));
        System.out.println(nomes.contains("Antonio"));
        System.out.println("size: " + nomes.size());
        System.out.println("IndexOf: " + nomes.indexOf("Ana"));
        
        
        
        nomes.remove(0);
        System.out.println(nomes.toString());
        nomes.clear();
        System.out.println(nomes.toString());
    }
    
}
