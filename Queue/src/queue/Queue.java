/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;
import java.util.Scanner;

/**
 *
 * @author Shaoun
 */
public class Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in= new Scanner(System.in);
        QueueExam ob = new QueueExam();
        
        String item;
        char c;
        for (int i = 0; i < 2; i++){
            item = in.nextLine();
            ob.push(item);   
        }
        
        for (int i = 0; i < 2; i++){         
            item = ob.pop();
            c = item.charAt(0);
            if(c =='a' || c =='e' || c =='i' || c =='o' || c =='u' ||  c=='A' || c =='E' || c =='I' || c =='O' || c =='U')
                System.out.println(item);
        }
    }
    
}
