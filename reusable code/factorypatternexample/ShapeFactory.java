/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypatternexample;
import java.util.*;
import java.io.*;

/**
 *
 * @author Shan
 */
public class ShapeFactory{
    //create properties object to load config file
    //properties file format must be porpertyName=propertyValue or propertyName:propertyValue
    //https://docs.oracle.com/cd/E23095_01/Platform.93/ATGProgGuide/html/s0204propertiesfileformat01.html
    private static Properties shapes = new Properties();
    
    //static code block, will be executed when class loaded
//    static{
//        //read config file as stream
//        InputStream in = ShapeFactory.class.getResourceAsStream("panel.properties");
//
//        //properties.load
//        try{
//            shapes.load(in);
//        }
//        catch(IOException e){
//            throw new RuntimeException(e);
//        }
//        
//        
//    }
    
    public  static void loadConfig()throws Exception{
    
        InputStream in = ShapeFactory.class.getResourceAsStream("panel.properties");
        shapes.load(in);
        in.close();
    }
    
    //create individual class instance
    public static Shape getShapes(int type) throws Exception{
        
        String className = (String)shapes.getProperty(String.valueOf(type));
        
        return (Shape)Class.forName(className).newInstance();
    
        
    }
}
