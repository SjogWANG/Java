/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myTomcatDemo;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author Shan
 */
public class MyTomcat {
    private int port; //declare port 
    
    public MyTomcat(int port){
        this.port = port;
    }
    
    //start service
    public void start()throws IOException {

        ServerSocket mySocket = new ServerSocket(port); //start listen port
        System.out.println("myTomcat is started ...." + port);
        Socket socket = null;
        while(true){
            socket=mySocket.accept();//accept service
            InputStream inputStream=socket.getInputStream();//get user input
            
            MyRequest myRequest = new MyRequest(inputStream);
            
             //response
            OutputStream outputStream=socket.getOutputStream();
            MyResponse myResponse = new MyResponse(outputStream);
            myResponse.write("hello world!!");
            
            
            
            /*
            InputStream inputStream=socket.getInputStream();//get user input
            
            //processing user request
            String httpRequest = "";
            byte[] bytes = new byte[1024];
            int length = 0;
            length=inputStream.read(bytes);
            if(length > 0){
                httpRequest = new String(bytes, 0, length);
            }
            
            //response
            OutputStream outputStream=socket.getOutputStream();
            outputStream.write("hello world".getBytes());
            */
            socket.close();
            
        
        }
        
    }
    //initialize
    private Map<String, String> urlServletMap = new HashMap<>();
    private void initServletMap(){
        for(myServletMap myServletMap:)
    
    }
    
    public static void main(String[] args) throws IOException{
        
        MyTomcat test = new MyTomcat(8888);
        test.start();
    }

}
