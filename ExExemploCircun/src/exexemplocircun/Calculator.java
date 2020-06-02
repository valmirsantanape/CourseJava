/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exexemplocircun;

/**
 *
 * @author valmi
 */
public class Calculator {
    public static double PI = 3.14159;
    
    public static double circunferencia(double raio){
        return 2.0 * PI * raio;
    }
    public static double volume(double raio){
        return 4 * PI * raio* raio* raio/3;
    }
    
}
