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
public class ContaEmpresa extends Conta{
    //Função extends dá a classe ContaEmpresa
    //todos os dados e comportamento 
    //da classe Conta
    private double emprestimo;
    
    public ContaEmpresa(){
        super();   
    } 

    public ContaEmpresa(double emprestimo) {
        this.emprestimo = emprestimo;
    }

    public ContaEmpresa(int conta, String nome, double saldo, double emprestimo) {
        super(conta, nome, saldo);
        this.emprestimo = emprestimo;
    }

    

    public double getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(double emprestimo) {
        this.emprestimo = emprestimo;
    }
    
    public void emprestimo(double conta){
        if(conta <= emprestimo){
        saldo = saldo + emprestimo - 10;
            deposito(conta);
        }
    }
}
