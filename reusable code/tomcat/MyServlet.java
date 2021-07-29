/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myTomcatDemo;

/**
 *
 * @author Shan
 */
public abstract class MyServlet {
    public abstract void doGet(MyRequest myRequest, MyResponse myResponse);
    public abstract void doPost(MyRequest myRequest, MyResponse myResponse);
    public void serice(MyRequest myRequest, MyResponse myResponse){
        if(myRequest.getMethod().equalsIgnoreCase("POST")){
            doPost(myRequest, myResponse);
        }else if(myRequest.getMethod().equalsIgnoreCase("GET")){
            doGet(myRequest, myResponse);
        }
    
    }
    
}
