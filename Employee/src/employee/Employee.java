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
public class Employee {	
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here	

    Employees ob = new Employees("Shaoun",1200.00,12,"13213131");
    person ob1 = new person("Shaoun Chandra Shill",1200.00,12,"13213131");
    
    System.out.println( "Emplyee_Name" +" "+ ob.getEmplyee_Name());
    System.out.println( "Emplyee_Salary" +" "+ ob.getEmplyee_Salary()); 
    System.out.println( "Emplyee_Work" +" "+ ob.getEmplyee_Work() );
    System.out.println( "Emplyee_NINUM " + " "+ ob.getEmplyee_NINUM() );
    System.out.println( "all information : " + " "+ ob.tostring() );
    
    System.out.println( "person_Name" +" "+ ob1.getPerson_Name());
    System.out.println( "person_Salary" +" "+ ob1.getPerson_Salary()); 
    System.out.println( "person_Work" +" "+ ob1.getPerson_Work() );
    System.out.println( "person_NINUM " + " "+ ob1.getPerson_NINUM() );
    System.out.println( "all information : " + " "+ ob1.tostring() );

    
    String Str1 = new String(ob.getEmplyee_Name());
    String Str2 = Str1;
    String Str3 = new String(ob1.getPerson_Name());
    boolean retVal;

    retVal = Str1.equals( Str2 );
    System.out.println("Returned Value = " + retVal );

    retVal = Str1.equals( Str3 );
    System.out.println("Returned Value = " + retVal );
   }	
    
}
