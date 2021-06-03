/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.handling.pkg1;

/**
 *
 * @author Shaoun
 */
public class ExceptionHandling1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            int a[] = new int[5];
            a[5] = 30/0;
        }
        catch(Exception e){
            System.out.println("common task completed");
        }
        /*catch(ArithmeticException e){
            System.out.println("task1 is completed");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("task2 completed");
        }*/
        System.out.println("rest of the code.....");
        
    }
    
}
