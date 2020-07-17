/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.servico;

import entidades.AluguelCarro;
import entidades.Fatura;

/**
 *
 * @author valmi
 */
public class ServicoAluguel {
    private Double precoHora;
    private Double precoDia;
    
    private BrasilServico taxaBrasilServico;

    public ServicoAluguel(Double precoHora, Double precoDia, BrasilServico taxaBrasilServico) {
        this.precoHora = precoHora;
        this.precoDia = precoDia;
        this.taxaBrasilServico = taxaBrasilServico;
    }
    
    public void processoAluguel(AluguelCarro alguelCarro){
        long t1 = alguelCarro.getInicio().getTime();
        long t2 = alguelCarro.getFim().getTime();
        
        double horas = (double) (t2 - t1)/100/60/60;
        
        double pagamentoBasico;
        if( horas <= 12){
            pagamentoBasico = Math.ceil(horas) * precoHora;
        }else{
            pagamentoBasico = Math.ceil(horas / 24) * precoDia;
        }
        
        double taxa = taxaBrasilServico.taxa(pagamentoBasico);
        
        alguelCarro.setFatura(new Fatura(pagamentoBasico, taxa));
    }
    
}
