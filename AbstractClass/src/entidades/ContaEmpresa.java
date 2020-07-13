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
public class ContaEmpresa extends Conta {
    
    private double limitEmprestimo;
    
    public ContaEmpresa(){
        super();
    }

    public ContaEmpresa(double limtEmprestimo) {
        this.limitEmprestimo = limtEmprestimo;
    }

    public ContaEmpresa(int numero, String nome, double saldo, double limtEmprestimo) {
        super(numero, nome, saldo);
        this.limitEmprestimo = limtEmprestimo;
    }
    public Double pegarLimit(){
        return limitEmprestimo;
    }
    
    //----
    public void mudarLimit(Double limitEmprestimo) {
		this.limitEmprestimo = limitEmprestimo;
	}
	
	public void emprestimo(double amount) {
		if (amount <= limitEmprestimo) {
			saldo += amount - 10.0;
		}
	}
    //---
}
