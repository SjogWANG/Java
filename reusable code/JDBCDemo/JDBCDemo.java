/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCDemo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
/**
 *
 * @author Shan
 */
public class JDBCDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        
        try {

            String url = "jdbc:mysql://shanwang.mysql.polardb.australia.rds.aliyuncs.com:3306/kkbdb";
            String uname = "shangwang";
            String password = "Adrian@1977";
            // create a connection to the database
            conn = DriverManager.getConnection(url, uname, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            
            return;
        }
        
        System.out.println("Connect to my remote database");
        
        String query = "SELECT * FROM kkb_type";
        
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        try{
            //prepare sql statement
            statement = conn.prepareStatement(query);
            System.out.println("sql prepared!");
            //execute sql
            resultSet = statement.executeQuery();
            System.out.println("sql excecuted!");
            
            while(resultSet.next()){
                System.out.println("read data!");
                String data = "";
                for(int i = 1; i <= 3; i++){
                    data += resultSet.getString(i) + ":";
                }
                System.out.println(data);
            }
        }
        catch(Exception e){
        
            System.out.println(e.getMessage());
            return;
        }
        
        
        
    }
    
}
