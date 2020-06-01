/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author valmi
 */
public class Retangulo {
    public double largura;
    public double altura;
    
    public double area(){
        return largura * altura;
       
    }
    public double perimetro(){
        return (largura * altura)/2;
    }
    public double diagonal(){
        return (largura + altura)/2;
    }
}
