/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeclass;

/**
 *
 * @author Shaoun
 */
public class Employeeclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        employee ob = new employee();
        ob.setId(7768);
        ob.setFirstname("Shaoun Chandra");
        ob.setLastname("Shill");
        ob.setsalary(100000);
        
        System.out.println("ID number is:"+ob.getId());
        System.out.println(ob.toString());
        System.out.println("Monthly Salary is;"+ob.getSalary());
        System.out.println("Annual Salary is;"+ob.getannualsalary());
        System.out.println("Salary is Raised 25% and new Salary will be;"+ob.raisedsalary(0.25));
        System.out.println("For 5 days absent deduced salary is:"+ob.deducted(5));
       
    }
    
}
