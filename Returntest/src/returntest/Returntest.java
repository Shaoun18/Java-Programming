/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returntest;

/**
 *
 * @author Shaoun
 */
public class Returntest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Returntest1 ob1 = new Returntest1(2);
    Returntest1 ob2;
    ob2 = ob1.incrByTen();

    System.out.println("ob1.a: " + ob1.a);
    System.out.println("ob2.a: " + ob2.a);

    ob2 = ob2.incrByTen();

    System.out.println("ob2.a after second increase: " + ob2.a);
    }
    
}
