/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack1;
import java.util.Scanner;

/**
 *
 * @author Shaoun
 */
public class Stack1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in = new Scanner(System.in);
        Stackexam ob1 = new Stackexam();
        int item;
        
        for (int i = 0; i < 5; i++) {
            item = in.nextInt();
            if(item%5==0)
                ob1.push(item);
        }
        for (int i = 0; i < 5; i++) {
            item = ob1.pop();
            if(item%3==0)
                System.out.println(item);
        }
    }
    
}
