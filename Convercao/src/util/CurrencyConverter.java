/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author valmi
 */
public class CurrencyConverter {
    
    
    public static double IOF = 0.06;
    public static double dolarToReal(double amount, double dolarprice){
        return amount*dolarprice*(1+IOF);
    }
}
