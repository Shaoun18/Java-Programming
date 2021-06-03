// Q : 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author Shaoun
 */
public class Account {

    /**
     * @param args the command line arguments
     */
          
  int a;
  int b;
  
  Account ( int a , int b)
  {
      this.a=a;
      this.b=b;
     }

 public void showData(){
   System.out.println("Value of a ="+a);
   System.out.println("Value of b ="+b);
 }

    
    public static void main(String[] args) {
        // TODO code application logic here
     
     Account  obj[] = new Account[2] ;
     obj[0] = new Account(5,10);
     obj[1] = new Account(6,15);
    
    System.out.println("For Array Element 0");
      obj[0].showData();

    System.out.println("For Array Element 1");
     obj[1].showData();
  }

        
    }
