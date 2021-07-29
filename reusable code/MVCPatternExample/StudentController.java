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
public class StudentController {
    
    private Student myStudent;
    private StudentView myView;

    public StudentController(Student myStudent, StudentView myView) {
        this.myStudent = myStudent;
        this.myView = myView;
    }

    public Student getMyStudent() {
        return myStudent;
    }

    public void setMyStudent(Student myStudent) {
        this.myStudent = myStudent;
    }

    public StudentView getMyView() {
        return myView;
    }

    public void setMyView(StudentView myView) {
        this.myView = myView;
    }
    
    public void updateView(){
    
        this.myView.printStudentDetails(this.myStudent.getRollNo(), this.myStudent.getName());
    }
    
    
}
