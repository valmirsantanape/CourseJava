/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import entidades.AluguelCarro;
import entidades.Veiculo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import modelo.servico.BrasilServico;
import modelo.servico.ServicoAluguel;

/**
 *
 * @author valmi
 */
public class Main{ 
        public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
            
        System.out.println("Entre com os dados do aluguel");
        System.out.println("Modelo do veículo: ");
        String carro = sc.nextLine();
        
        System.out.println("Pegar (dd/MM/yyyy hh:ss): ");
        Date inicio = sdf.parse(sc.nextLine());
        
        System.out.println("Retornar (dd/MM/yyyy hh:ss): ");
        Date fim = sdf.parse(sc.nextLine());
        AluguelCarro cr = new AluguelCarro(inicio, fim, new Veiculo(carro));
        
        System.out.println("Entre com preço por hora: ");
        double precoHora = sc.nextDouble();
        System.out.println("Entre com preço por dia: ");
        double precoDia = sc.nextDouble();
        
            ServicoAluguel servicoAluguel = new ServicoAluguel(precoDia, precoHora, new BrasilServico());
            
            servicoAluguel.processoAluguel(cr);
            
            System.out.println("Fatura: ");
            System.out.println("Pagamento Basico: " + String.format("%.2f", cr.getFatura().getPagamentoBasico()));
            System.out.println("Taxa: " + String.format("%.2f", cr.getFatura().getTaxa()));
            System.out.println("Pagamento total: " + String.format("%.2f", cr.getFatura().getPagamentoTotal()));
            
            
            
        sc.close();
        } 
            
          
            
            
            
    
    
}
