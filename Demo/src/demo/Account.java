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
public class Account {
    String id, name;
    int balance= 0;
    Account(String id,String name)
    {
        this.id=id;
        this.name=name;
        
    }
    Account(String id, String name, int balance)
    {
    this.id=id;
    this.name=name;
    this.balance= balance;
    }
    String getID ()
    {
        return id;
    }
    String getname ()
    {
        return name;
    } 
    int balance()
    {
        return balance;
    }
    int credit( int amount) 
    {
        balance= balance + amount;
        return balance;
    }
    int debit ( int amount) 
    {
        if ( balance>=amount )
            balance= balance-amount;
        else
            System.out.println("not enough balance");
    return balance;
    }
   int transferTo ( Account another, int amount)
   {    
       if ( balance >= amount )      
           balance= balance - amount;
       else         
           System.out.println("not enough balance");
    another.balance = another.balance + amount;
    return balance;
   }
   String tostring ()
   {
        return "name" + " " + name + " " + "id:" + id + " "+  "balance" + " " + balance;
   }
}
