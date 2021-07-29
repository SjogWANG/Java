/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myTomcatDemo;
import java.io.IOException;

/**
 *
 * @author Shan
 */
public class DeleteServlet extends MyServlet{
    
    @Override
    public void doGet(MyRequest myRequest, MyResponse myResponse){
        try{
            myResponse.write("delete success ... Get");
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse){
    
        try{
            myResponse.write("delete success ... Post");
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        
    }
}
