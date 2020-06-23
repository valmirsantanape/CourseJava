/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entiteis;

/**
 *
 * @author valmi
 */
public class Conta {
    private int conta;
    private String nome;
    protected double saldo;
    
    public Conta(){
        
    }

    public Conta(int conta, String nome, double saldo) {
        this.conta = conta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }
    
    
    
    public void saque(double conta){
        saldo = saldo - conta;
        
    }
    public void deposito(double conta){
        saldo = saldo + conta;
    }
}
