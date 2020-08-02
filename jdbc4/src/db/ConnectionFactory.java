package db;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author valmi
 */
public class ConnectionFactory {
    public Connection getConnection(){
        try {
            return (Connection) DriverManager.getConnection("jdbc:mysql://localhost/coursejdbc?useTimezone=true&serverTimezone=UTC","root","12345");
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            JOptionPane.showMessageDialog(null, "Falha na conexao " + e);
        }
        return null;
        
    }

    

   

   

    
    
    
}
