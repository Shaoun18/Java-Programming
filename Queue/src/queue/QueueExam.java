/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Shaoun
 */
public class QueueExam {
        int front,rear;
    String queue[] = new String[10];
    
    QueueExam(){
        front = -1;
        rear = -1;
    }
    void push(String item){
        if(rear==10){
            System.out.println("Queue is full!");
        }
        else{
            rear = rear+1;
            queue[rear]= item;
        }
    }
    String pop(){
        if(front==rear){
            System.out.println("Queue is empty!");
            return "";        
        }
        else{
            front = front+1;
            return queue[front];
        }
    }
}
