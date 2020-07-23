/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import db.ConnectionFactory;
import java.beans.Statement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;




/**
 *
 * @author valmi
 */
public class Program {
    //private Connection conn;
    
    
    public Program(){
        //this.con = new ConnectionFactory().getConnection();
    }
    
    
    public static void main(String[] args) throws SQLException {
        
        try{
        ConnectionFactory conn = new ConnectionFactory();
        
        conn.getConnection();
        
        String sql = "select * from department";
     
        PreparedStatement stmt;
        stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
            
        
        while(rs.next()){
            System.out.println(rs.getInt("Id")+ ", " + rs.getString("Name"));
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Faha ao conectar com bano de dados " + e);
            
        }
        
    }
    
}
