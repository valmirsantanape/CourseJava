/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import entidades.Conta;
import entidades.ContaEmpresa;
import entidades.ContaPoupanca;
//import entidades.ContaEmpresa;
//import entidades.ContaPoupanca;
import java.util.ArrayList;
import java.util.List;






/**
 *
 * @author valmi
 */
public class Program {
    public static void main(String[] args) {
        
//        Conta acc1 = new Conta(1011, "João", 1000.00);
//        Conta acc2 = new ContaEmpresa(1012 , "Maria", 1000.00, 500.00);
//        Conta acc3 = new ContaPoupanca(1013  , "Antonio", 1000.00, 0.03);

        List<Conta> list = new ArrayList<>(); 
        list.add(new ContaEmpresa(0, "Joao", 0, 0));
        list.add(new ContaPoupanca(0, "Maria", 0, 0));
        list.add(new ContaEmpresa(0, "Camila", 0, 0));
        list.add(new ContaPoupanca(0, "Antonio", 0, 0));
        
        double soma = 0;
        
        
        System.out.println("Saldo total " + soma);
        
        for(Conta acc : list){ //Paracada conta "acc" na minha lista chamada "list" eu vou fazer
            acc.deposito(10.0);
         }
        
        for(Conta acc : list){
            System.out.println(acc.getNome() +": "+ acc.getSaldo());
        }
        
        for(Conta acc : list){ //Paracada conta "acc" na minha lista chamad "list" eu vou fazer
            soma += acc.getSaldo();
        }
        
        System.out.println("Saldo total atualizado " + soma);
    }
}
