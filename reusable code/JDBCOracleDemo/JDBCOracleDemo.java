/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcoracledemo;


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
public class JDBCOracleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
            return;
        }
        
        try {

            String url = "jdbc:oracle:thin:@35.166.130.72:1521:xe";
            String uname = "jinghuaZAss2";
            String password = "000920418";
            // create a connection to the database
            conn = DriverManager.getConnection(url, uname, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            
            return;
        }
        
        System.out.println("Connect to my remote database");
        
        String query = "SELECT a.companyName, a.countNoOfBuses() from company_table a";
        
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
                for(int i = 1; i <= 2; i++){
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
