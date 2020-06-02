/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento;

/**
 *
 * @author valmi
 */
public class Produto {
    private String nome;
    private double price;
    private int quantity;
    
    
    
    
    
    public Produto(String nome, double price, int quantity){
        this.nome = nome;
        this.price = price;
        this.quantity = quantity;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    
    
    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProduct(int qtd){
        this.quantity = quantity + qtd;
        
    }
    public void removeProduct(int qtd){
        this.quantity = quantity - qtd;
    }
    public String toString(){
        return nome
                + ", $"
                + String.format("%.2f", price)
                +", "
                + quantity
                + "units, Total: $ " 
                + String.format("%.2f",totalValueInStock());
    }
}
