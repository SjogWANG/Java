/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myTomcatDemo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shan
 */
public class MyServletConfig {
    public static List<MyServletMap> list = new ArrayList<>();
    static{
        list.add(new MyServletMap("login", "/login", "myTomcatDemo.LoginServlet"));
        list.add(new MyServletMap("delete", "/delete", "myTomcatDemo.DeleteServlet"));
    }
}
