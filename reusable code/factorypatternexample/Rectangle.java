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
public class Rectangle extends Shape{
    Rectangle(){
        System.out.println("rectangle instance created!");
    }
    
    @Override
    void draw(){
        System.out.println("draw a rectangle!");
    }
}
