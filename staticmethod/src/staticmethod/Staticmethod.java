// Q : static method java

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticmethod;

/**
 *
 * @author Shaoun
 */
public class Staticmethod {

    /**
     * @param args the command line arguments
     */
    int rollno;
    String name;
    static String college = "ITS";
    
    static void change (){
    college = "BBDIT";
    }
    
    Staticmethod(int r,String n){
    rollno = r;
    name = n;
    }
    
    void display(){
    System.out.println(rollno + " " + name +  " "+ college);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Staticmethod.change();
        
        Staticmethod s1 = new Staticmethod(111,"shaoun");
        Staticmethod s2 = new Staticmethod(112,"shaoun");
        Staticmethod s3 = new Staticmethod(113,"shaoun");
        
        s1.display();
        s2.display();
        s3.display();
    
    }
    
}
