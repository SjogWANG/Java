/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterdemo;

/**
 *
 * @author Shan
 */
public class AdapterDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ps2 myPs2 = new MyPs2();
        myPs2.isPs2();
        
        //use adapter1 class extends MyUsb2 class
        Ps2 myPs2_1 = new AdapterUsb1();
        myPs2_1.isPs2();
        
        //use adapter2 class aggregate MyUsb2 class
        Ps2 myPs2_2 = new AdapterUsb2(new MyUsb2());
        myPs2_2.isPs2();
    }
    
}
