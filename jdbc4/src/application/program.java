package application;


import java.sql.PreparedStatement;
import db.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valmi
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection con = new ConnectionFactory().getConnection();
        
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        String sql = "UPDATE seller"
                + "SET BaseSalary = BaseSalary + ? "
                + "WHERE "
                + "(DepartmentId = ?)";
        
        try {
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setDouble(1, 200);
            stmt.setInt(2, 2);
            
            int linhaAlteradas = stmt.executeUpdate();
            
            System.out.println("Pronto! Linhas alteradas: " + linhaAlteradas);
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
        
        
        
        
        
    }
    
}
