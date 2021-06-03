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
public class employee extends person{
    private double annualsalary;
    private int joiningyear;
    private String nationalinsurancenumber;

    employee(String m, double i, int z, String k) {
        super(m);
        annualsalary = i;
        joiningyear = z;
        nationalinsurancenumber = k;
    }

    public double getAnnualsalary() {
        return annualsalary;
    }

    public int getJoiningyear() {
        return joiningyear;
    }

    public String getNationalinsurancenumber() {
        return nationalinsurancenumber;
    }
}
