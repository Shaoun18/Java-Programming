// Q  : static variable java

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticvariable;

/**
 *
 * @author Shaoun
 */
public class Staticvariable {

    /**
     * @param args the command line arguments
     */
    int rollno;
    String name;
    static String college = "ITS";
    
    Staticvariable(int r,String n){
    rollno = r;
    name = n;
    }
    
    void display(){
    System.out.println(rollno + " " + name +  " "+ college);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Staticvariable s1 = new Staticvariable(111,"shaoun");
        Staticvariable s2 = new Staticvariable(112,"shaoun");
        Staticvariable s3 = new Staticvariable(113,"shaoun");
        
        s1.display();
        s2.display();
        s3.display();
    
    }
    
}
