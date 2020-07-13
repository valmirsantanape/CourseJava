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
public class ContaPoupanca extends Conta {
    
    private double taxajuros;
    
    public ContaPoupanca(){
        super();
    }

    public ContaPoupanca(int numero, String nome, double saldo, double taxajuros ) {
        super(numero, nome, saldo);
        this.taxajuros = taxajuros;
    }
    
    public double pegarTaxa(){
        return taxajuros;
    }
    public void mudarTaxa(double taxajuros){
        this.taxajuros = taxajuros;
    }
    public void atualizarSaldo(){
        saldo = saldo + saldo * taxajuros;
    }
    
    
}
