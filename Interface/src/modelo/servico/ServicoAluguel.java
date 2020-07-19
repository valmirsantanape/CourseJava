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
    private Double precoDia;
    private Double precoHora;
    
    private TaxaServico taxaServico;

    public ServicoAluguel(Double precoDia, Double precoHora, TaxaServico taxaBrasilServico) {
        this.precoDia = precoDia;
        this.precoHora = precoHora;
        this.taxaServico = taxaServico;
    }
    
    
    public void processoAluguel(AluguelCarro alguelCarro){
        long t1 = alguelCarro.getInicio().getTime();
        long t2 = alguelCarro.getFim().getTime();
        
    
        double horas = (double) (t2 - t1)/1000/60/60;
        
        
        double pagamentoBasico;
        if( horas <= 12){
            pagamentoBasico = Math.ceil(horas) * precoHora;
        }else{
            pagamentoBasico = Math.ceil(horas / 24) * precoDia;
        }
        
        double taxa = taxaServico.taxa(pagamentoBasico);
        
        alguelCarro.setFatura(new Fatura(pagamentoBasico, taxa));
        //Operacao reponsavel por gerar a nota de pagamento
    }
    
}
