/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcpatterndemo;

/**
 *
 * @author Shan
 */
public class MVCPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student student = new Student();
        StudentView view = new StudentView();
        
        student.setName("Wang Shan");
        student.setRollNo("12345");
        
        StudentController controller = new StudentController(student, view);
        controller.updateView();
        
    }
    
}
