/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxypatternclient;

/**
 *
 * @author Shan
 */
public class ProxyInternetAccess implements OfficeInternetAccess {
    private String employeeName;
    private RealInternetAccess realIntAccess;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }
    
    @Override
    public void grantInternetAccess()
    {
        if(getRole(this.employeeName) > 4)
        {
            realIntAccess = new RealInternetAccess(this.employeeName);
            realIntAccess.grantInternetAccess();
        }
        else
        {
            System.out.println("No internet access granted, your job level is below 5!");
        }
    }
    
    public int getRole(String employeeName){
        //retrieve from database to check the privilege of the employee
        return 9;
    
    }
    
}
