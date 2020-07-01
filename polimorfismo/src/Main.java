/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author camila
 */
public class Main {
    public static void main(String[] args) {
        Conta x = new Conta(2200, "Antonio" , 2000);
        Conta y = new SalveConta(2203, "Maria", 1000);
        
        x.saque(50);
        y.saque(100);
        
        System.out.println(x.getSaldo());
        System.out.println(y.getSaldo());
        
    }
 
    
}
