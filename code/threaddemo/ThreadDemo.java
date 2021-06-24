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
public class ThreadDemo extends Thread{
    
    @Override
    public void run(){
        for(int i = 0; i < 10000; i++){
            count++;
        }
    }

    private static int count;
    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        ThreadDemo myThread1 = new ThreadDemo();
        ThreadDemo myThread2 = new ThreadDemo();
        myThread1.start();
        myThread2.start();
        myThread1.join();
        myThread2.join();
        System.out.println(count);
    }
    
}
