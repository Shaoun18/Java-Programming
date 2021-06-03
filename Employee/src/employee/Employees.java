/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Shaoun
 */
public class Employees {
    private String Emplyee_Name;
    private double Emplyee_Salary;
    private int Emplyee_Work;
    private String Emplyee_NINUM;   
    
    public Employees(String Emplyee_Name,double Emplyee_Salary,int Emplyee_Work,String Emplyee_NINUM){
    this.Emplyee_Name = Emplyee_Name;
    this.Emplyee_Salary = Emplyee_Salary;
    this.Emplyee_Work = Emplyee_Work;
    this.Emplyee_NINUM = Emplyee_NINUM;
    }
    public String getEmplyee_Name(){
     return Emplyee_Name;
    }
    public void setEmplyee_Name(String Emplyee_Name){
     this.Emplyee_Name = Emplyee_Name;
    }
    public double getEmplyee_Salary(){ 
     return Emplyee_Salary*12;
    }   
    public void setEmplyee_Salary(double Emplyee_Salary){
     this.Emplyee_Salary = Emplyee_Salary;
    }
    public int getEmplyee_Work(){
     return Emplyee_Work;
    }   
    public void setEmplyee_Work(int Emplyee_Work){
     this.Emplyee_Work = Emplyee_Work;
    }
    public String getEmplyee_NINUM(){
     return Emplyee_NINUM;
    } 
    public void setEmplyee_NINUM(String Emplyee_NINUM){
     this.Emplyee_NINUM = Emplyee_NINUM;
    }
    public String tostring(){
    return ("Emplyee_Name : " + " "+Emplyee_Name+"; Emplyee_Salary :"+ " "+Emplyee_Salary+"; Emplyee_Work : "+" "+Emplyee_Work+"; Emplyee_NINUM :"+" "+Emplyee_NINUM);
    }
    
}
