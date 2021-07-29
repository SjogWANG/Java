/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shan
 */

public class SingletonDemo {
    private static SingletonDemo obj = new SingletonDemo();
    private SingletonDemo(){}
    
    public static SingletonDemo getInstance(){
        return obj;
    }
    
    public void doSomething(){
        System.out.println("I am trying to understand Singleton pattern");
    }
    
    
}
