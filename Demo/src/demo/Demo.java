/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Shaoun
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account ob= new Account ("1", "kamal" , 1000) ;
        Account ob1= new Account ("2", "jamal" , 2000) ; 
        System.out.println( "name" +" "+ ob.getname());
        System.out.println( "name" +" "+ ob.getID()); 
        System.out.println( "balance" +" "+ ob.balance() );
        System.out.println( "after  credit" + " "+ ob.credit(500) );
        System.out.println( "after  debit" + " "+ ob.debit(1000) ); 
        System.out.println( "before transfer from ob1" +" "+ ob1.balance() );
        System.out.println( "after  transfer balance of ob" + " " + ob.transferTo(ob1,100) );
        System.out.println( "after transfer balance of ob1" +" "+ ob1.balance() );
        System.out.println( "all information" + " "+ ob.tostring() );
    }
    
}
