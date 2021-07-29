/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypepatterndemo;

/**
 *
 * @author Shan
 */
public class ConcreteEmployee  implements Cloneable{
    
    private String attr;

    public ConcreteEmployee(String attr) {
        this.attr = attr;
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    @Override
    public String toString() {
        return "ConcreteEmployee{" + "attr=" + attr + '}';
    }
    
    @Override
    public ConcreteEmployee clone(){
    
        Object obj = null;
        
        try{
            obj = super.clone();
        }catch(CloneNotSupportedException e){
            System.err.println("Not support cloneable");
        }
        return (ConcreteEmployee)obj;
    }
    
}
