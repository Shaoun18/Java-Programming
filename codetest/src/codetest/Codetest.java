// Q : Anonymous class.

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetest;

/**
 *
 * @author Shaoun
 */
public class Codetest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A  object =  new A() {
      @Override public void print() {
       System.out.println("Hello");
       }
    };
    object.print();
   }
    
}
