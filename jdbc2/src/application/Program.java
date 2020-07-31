/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import db.ConnectionFactory;
import java.sql.SQLException;
import java.sql.Connection;


/**
 *
 * @author valmi
 */
public class Program {
        
    
    
    
    public static void main(String[] args) {
       Connection con = null;
        
        
       try {
            con = new ConnectionFactory().getConnection();
        
        
//            
//            
            String sql = "select * from department";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
