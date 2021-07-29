/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;

/**
 *
 * @author Shan
 */
public class ThreadDemo2 implements Runnable{
    
    @Override
    public void run(){
        for(int i = 0; i < 20000; i++)
        {
            count++;
        }
    }
    /**
     * @param args the command line arguments
     */
    private static int count;
    
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        ThreadDemo2 myDemo1 = new ThreadDemo2();
        ThreadDemo2 myDemo2 = new ThreadDemo2();
        Thread myThread1 = new Thread(myDemo1);
        Thread myThread2 = new Thread(myDemo2);
        myThread1.start();
        myThread2.start();
        myThread1.join();
        myThread2.join();
        System.out.println(count);
    }
    
}
