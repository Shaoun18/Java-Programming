/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.pkgclass;

/**
 *
 * @author Shaoun
 */
public class EmployeeClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        employee ob = new employee("Shaoun", 400000, 2022, "SMSA1344");

        System.out.println(ob.getName());
        System.out.println(ob.getAnnualsalary());
        System.out.println(ob.getJoiningyear());
        System.out.println(ob.getNationalinsurancenumber());
    }
    
}
