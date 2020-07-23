/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;


/**
 *
 * @author valmi
 */
public class DB {
    
    private static Connection conn = null;
    
    public static Connection getConnection() {
        
        if(conn == null){
        
            try {
                
            
            Properties props = loadProperties();
            String url = props.getProperty("dburl");
            conn = DriverManager.getConnection(url, props);
            
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
            
            
        }
        return conn;
        
    }
    
    public static void closeConnection(){
        
        if (conn != null){
            try {
                
            
            conn.close();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
            }
        }
    }
    
    
    
    private static Properties loadProperties(){
        try (FileInputStream fs = new FileInputStream("db.properties")){
            Properties pros = new Properties();
            pros.load(fs);
            return pros;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }
    
}
