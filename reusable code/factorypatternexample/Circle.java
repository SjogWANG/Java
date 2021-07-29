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
public class Circle extends Shape { //inheritate from abstract class shape
    
    Circle(){
        System.out.println("circle instance created!");
    }
    
    @Override
    void draw(){
        System.out.println("draw a circle!");
    }
}
