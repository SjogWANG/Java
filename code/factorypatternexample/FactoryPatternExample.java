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
public class FactoryPatternExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //read input from stdin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input Shape Type: 1: circle; 2: rectangle; 3: line");
        while(true){
            int type = scanner.nextInt();
            if(type == 99){
                break;
            }
            try{
                ShapeFactory.loadConfig();
                Shape myShape = ShapeFactory.getShapes(type);
                if(myShape == null){
                    System.out.println("Input type not exist!");
                }
                else{
                    myShape.draw();
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        scanner.close();
        
    }
    
}
