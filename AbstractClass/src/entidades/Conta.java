/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author valmi
 */
public abstract class Conta {
    private int numero;
    private String nome;
    double saldo;
    
    public Conta(){
        
    }

    public Conta(int numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
    
    
   
    public void deposito(double valor){
        saldo = saldo + valor;
    }
    public void saque(double valor){
        saldo = saldo - valor;
    } 
    
    
}
