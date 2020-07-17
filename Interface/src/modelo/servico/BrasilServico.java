/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.servico;

/**
 *
 * @author valmi
 */
public class BrasilServico {
    public double taxa(double valor){
        
        if(valor <= 100){
            return valor * 0.2;
        }
        else{
            return valor * 0.15;
        }
    }
}
