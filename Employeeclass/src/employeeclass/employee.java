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
public class employee {
    private int Id;
    private String Firstname;
    private String Lastname;
    private int Salary;
    employee(){}
    
    public employee(int id,String Firstname,String Lastname,int Salary){
        this.Id = id;
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Salary = Salary;
    }
    
    public void setId(int Id) {
        this.Id = Id;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }


    public void setsalary(int salary){
        this.Salary = salary;
    }

    public int getId() {
        return Id;
    }
    
    public int getSalary() {
        return Salary;
    }

    public int getannualsalary(){
        return 12* getSalary();
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    
    
    public int deducted(int day){
        return day*1000;
        
    }
    
    public double raisedsalary(double percent){
        return (getSalary()+(getSalary() * percent)) ;
    }
    
    public String toString(){
        return "First Name is:"+getFirstname()+"\nLast Name is:"+getLastname();
    
}
}
