/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shan
 */
public class SingletonLazy {
    
    private static SingletonLazy obj = null;
    
    private SingletonLazy()
    {
    }
    
    public static SingletonLazy getInstance(){
    
        //DCL Lazy double check locking for thread safety
        if(obj == null){
            synchronized(SingletonLazy.class){
                if(obj == null){
                    obj = new SingletonLazy();
                }
            }
        }
        
        return obj;
    
    }
    
    public void doSomething(){
        System.out.println("I am trying to understand Singleton pattern");
    }
    
}
