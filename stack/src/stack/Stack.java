// Q : This class defines an integer stack that can hold 10 values Using the array.

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Shaoun
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
             
    public static void main(String args[]) {
        // TODO code application logic here
        
        TestStack mystack1 = new TestStack(2);
        TestStack mystack2 = new TestStack(6);
        
        /* for (int i = 0; i = 10; i++) 
            mystack1.push(i);
        for (int i = 10; i = 20; i++) 
            mystack2.push(i);    
            */
        
        int i;
        System.out.println("Stack in mystack1 : ");
        //for (i = 0; i = 2; i++)
            System.out.println(mystack1.pop());
        
        System.out.println("Stack in mystack2 : ");
        //for (i = 0; i = 6; i++)
            System.out.println(mystack2.pop());     
        
    }    
}
