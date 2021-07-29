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
public class PrototypePatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Employee obj = new Employee(1, "Shan Wang", "08/06/2020", "Manager", "10 Spruce Ave 5046");
//        Employee obj2 = (Employee)obj.getClone();
//        
//        System.out.println(obj);
//        System.out.println(obj2);
//        
//        obj2.setId(2);
//        
//        System.out.println(obj);
//        System.out.println(obj2);

        //use super.clone() method to clone new object
        ConcreteEmployee obj = new ConcreteEmployee("Shan Wang");
        ConcreteEmployee obj1 = obj.clone();
        System.out.println(obj);
        System.out.println(obj1);
        
    }
    
}
