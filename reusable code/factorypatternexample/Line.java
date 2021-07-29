/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypatternexample;

/**
 *
 * @author Shan
 */
public class Line extends Shape{
     Line(){
        System.out.println("line instance created!");
    }
    
    @Override
    void draw(){
        System.out.println("draw a line!");
    }
}
