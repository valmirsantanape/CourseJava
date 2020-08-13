package application;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import db.ConnectionFactory;
import java.sql.Connection;
import java.sql.Statement;
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
        Connection con = new ConnectionFactory().getConnection();
        
        try {
            String sql = "";
            Statement stmt = con.createStatement();
            
            int linhasAfetadas = stmt.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE  DepartmentId = 1");
            int linhasAfetadas2 = stmt.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE  DepartmentId = 2");
           
            int x = 1;
            
            if( x<2){
                throw new SQLException("Falha error! ");
            } 
            
            System.out.println("Linhas afetadas 1: " + linhasAfetadas);
            System.out.println("Linhas afetadas 2: " + linhasAfetadas2);
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
       
    }

        
}
