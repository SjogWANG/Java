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
public class AdapterUsb2 implements Ps2 {
    
    MyUsb2 myUsber;
    
    //constructor to initialize myUsber

    public AdapterUsb2(MyUsb2 myUsber) {
        
        this.myUsber = new MyUsb2();
    }
    
    @Override
    public void isPs2(){
    
        myUsber.isUsb();
    }
    
}
