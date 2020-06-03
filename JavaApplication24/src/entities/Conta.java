/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;
/**
 *
 * @author valmi
 */
public class Conta {
        private int conta;
    private String nome;
    private double saldo;

    public Conta(int conta, String nome) {
        this.conta = conta;
        this.nome = nome;
    }

    public Conta(int conta, String nome, double depositoInicial) {
        this.conta = conta;
        this.nome = nome;
        deposito(depositoInicial);
    }

    public int getConta() {
        return conta;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public void deposito(double montante){
        saldo += montante;
    }
    public void saque(double montante){
        saldo -= montante + 5.0;
    }
    public String toString(){
        return "Conta: "
                +conta
                +", Nome: "
                + nome
                +", Saldo: R$"
                +String.format("%.2f", saldo);
    }

    
}
