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
public class MyServletMap {
    private String servletName;
    private String url;
    private String clazz;
    
    public MyServletMap(String servletName, String url, String clazz){
        this.servletName = servletName; //delete or login
        this.url = url; //path
        this.clazz = clazz;
    }

    public String getServletName() {
        return servletName;
    }

    public void setServletName(String servletName) {
        this.servletName = servletName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
    
    
}
