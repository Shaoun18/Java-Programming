/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack1;

/**
 *
 * @author Shaoun
 */
public class Stackexam {
    private int top;
    private int stack[] = new int[10];
    
    Stackexam(){
        top= -1;
    }
    
    void push(int item){
        if(top==10){
            System.out.println("Stack Overflow");
        }
        else{
            top = top+ 1;
            stack[top]= item;
        }
    }
    int pop(){
        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            top = top-1;
            return stack[top+1];
        }
    }
}
