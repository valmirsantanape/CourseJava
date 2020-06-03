/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import entities.Conta;
import java.util.Scanner;

/**
 *
 * @author valmi
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner sc = new Scanner(System.in);
        

        Conta conta;
        System.out.println("Entre com o numero da conta: ");
        int numero = sc.nextInt();
        
        System.out.println("Informe seu nome: ");
        String nome = sc.next();
        System.out.println("Deseja realizar deposito? S/N");
        String sn = sc.next();
        
        if("S".equals(sn)){
            System.out.println("Informe o valor do deposito: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, nome, depositoInicial);
        
        }else{
            conta = new Conta(numero, nome);
        }
        
        System.out.println("Dados da conta:");
        System.out.println(conta);
        System.out.print("Entre com o valor de um novo deposito:");
        double depositeValue= sc.nextDouble();
        
        conta.deposito(depositeValue);
        
        System.out.println(conta);
        
        System.out.print("Entre com o valor para realizar saque:");
        double saqueValue= sc.nextDouble();
        
        conta.saque(saqueValue);
        System.out.println("-----------------------------------------------");
        System.out.println("               Saldo atualizado                ");
        System.out.println("|  "+conta+"  |");
         System.out.println("-----------------------------------------------");
        
    }
    
    
}
