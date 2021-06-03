/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Shaoun
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Test1 ob1 = new Test1(100, 22);
        Test1 ob2 = new Test1(100, 22);
        Test1 ob3 = new Test1(-1, -1);

        System.out.println("ob1 == ob2: " + ob1.equals(ob2)); 
        System.out.println("ob1 == ob3: " + ob1.equals(ob3));
    }
    
}
