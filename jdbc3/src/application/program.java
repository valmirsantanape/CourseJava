package application;


import java.sql.PreparedStatement;
import db.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
        Connection con;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String sql = "insert into seller "
                + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                + "values(?,?,?,?,?)";
        
        con = new ConnectionFactory().getConnection();
        
        try {
            PreparedStatement stmt;
            stmt = con.prepareStatement("insert into seller "
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                    + "values(?,?,?,?,?)");
            
            stmt.setString(1, "Carl Purple");
            stmt.setString(2, "Carl@gmail.com");
            stmt.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
            stmt.setDouble(4, 3000);
            stmt.setInt(5, 4);
            
            int rowsAffected = stmt.executeUpdate();
            //System.out.println("Done! Linhas alteradas: " + rowsAffected);
            if(rowsAffected > 0){
                ResultSet rs = stmt.getGeneratedKeys();
                while(rs.next()){
                    int id = rs.getInt(1);
                    System.out.println("Pronto! ID = " + id);
                }
                
            }else{
                System.out.println("Nenhuma linha foi alterada");

            }
            System.out.println("");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        catch(ParseException e){
            e.printStackTrace();
        }
        
        
    }
    
}
