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
public class Employee implements ProtoType{
    
    int id;
    String name;
    String dataOfBirth;
    String designation;
    String address;

    public Employee(int id, String name, String dataOfBirth, String designation, String address) {
        this.id = id;
        this.name = name;
        this.dataOfBirth = dataOfBirth;
        this.designation = designation;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(String dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    @Override
    public ProtoType getClone(){
        
       return new Employee(this.id, this.name, this.dataOfBirth, this.designation, this.address);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", dataOfBirth=" + dataOfBirth + ", designation=" + designation + ", address=" + address + '}';
    }
    
    
}
