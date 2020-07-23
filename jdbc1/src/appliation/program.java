/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appliation;

import db.ConnectionFactory;

import javax.swing.JOptionPane;


/**
 *
 * @author valmi
 */
public class program {
    public static void main(String[] args) {
        
        try {
            ConnectionFactory con = new ConnectionFactory();
        con.getConnection();
        
        JOptionPane.showMessageDialog(null, "Conectado!");
        } catch (Exception e) {
            
          JOptionPane.showMessageDialog(null, "Conectado! " + e);  
        }
        
    }
}
