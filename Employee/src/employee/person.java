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
public class person  {
    private String Person_Name;
    private double Person_Salary;
    private int Person_Work;
    private String Person_NINUM;   
    
    public person(String Person_Name,double Person_Salary,int Person_Work,String Person_NINUM){
    this.Person_Name = Person_Name;
    this.Person_Salary = Person_Salary;
    this.Person_Work = Person_Work;
    this.Person_NINUM = Person_NINUM;
    }
    public String getPerson_Name(){
     return Person_Name;
    }
    public void setPerson_Name(String Person_Name){
     this.Person_Name = Person_Name;
    }
    public double getPerson_Salary(){ 
     return Person_Salary*12;
    }   
    public void setPerson_Salary(double Person_Salary){
     this.Person_Salary = Person_Salary;
    }
    public int getPerson_Work(){
     return Person_Work;
    }   
    public void setPerson_Work(int Person_Work){
     this.Person_Work = Person_Work;
    }
    public String getPerson_NINUM(){
     return Person_NINUM;
    } 
    public void setPerson_NINUM(String Person_NINUM){
     this.Person_NINUM = Person_NINUM;
    }
    public String tostring(){
    return ("Person_Name : " + " "+Person_Name+"; Person_Salary :"+ " "+Person_Salary+"; Person_Work : "+" "+Person_Work+"; Person_NINUM :"+" "+Person_NINUM);
    }
}
