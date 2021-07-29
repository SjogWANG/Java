/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deepclonedemo;

/**
 *
 * @author Shan
 */
public class DeepCloneDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declare image instance
        Image image = new Image("shanwang.png", "com.kaikeba.util");
        Employee obj = new Employee(2, "Shan Wang", image);
        Employee obj1 = null;
        try{
            obj1 = obj.deepClone();
        }
        catch (Exception ex) {
            System.out.println("deep clone failed!" + ex.getMessage());
            return;
        }
        
        System.out.println("obj == obj1? : " + (obj == obj1));
        System.out.println("obj.image == obj1.image? : " + (obj.getImage() == obj1.getImage()));
    }
    
}
