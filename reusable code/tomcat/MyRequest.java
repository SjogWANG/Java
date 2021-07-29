/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myTomcatDemo;
import java.io.InputStream;
import java.io.IOException;

/**
 *
 * @author Shan
 */
public class MyRequest {
    private String url;
    private String method;
    
    
    public MyRequest(InputStream inputStream)throws IOException {
        String httpRequest = "";
        byte[] bytes = new byte[1024];
        int length = 0;
        length = inputStream.read(bytes);
        if(length > 0){
            httpRequest = new String(bytes, 0, length);
        }
        String httpHead=httpRequest.split("\n")[0];
        url=httpHead.split("\\s")[1];
        method=httpHead.split("\\s")[0];
    
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
    
    
    
}
