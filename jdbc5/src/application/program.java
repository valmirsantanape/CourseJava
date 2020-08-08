/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.sql.PreparedStatement;
import db.ConnectionFactory;
import db.DbIntegrarExcecao;
import java.sql.Connection;
import java.sql.SQLException;


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
        try {
        Connection con = new ConnectionFactory().getConnection();
        
        
            String sql = "DELETE FROM department"
                    + "WHERE "
                    + "Id = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, 2);
            
            int rowsAffected = stmt.executeUpdate();
            
            System.out.println("Liha afetadas: " + rowsAffected);
            
        } catch (SQLException e) {
            throw new DbIntegrarExcecao(e.getMessage());
            
        }
        //finally{
            //ConnectionFactory
        //}
    }
    
}
