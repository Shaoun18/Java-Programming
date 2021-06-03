/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package three.thread;

/**
 *
 * @author Shaoun
 */
public class ThreeThread extends Thread {

    /**
     * @param args the command line arguments
     */
    
    private String str;
    private int time;

    ThreeThread(String n, int m) {
        str = n;
        time = m;
    }

    public void run() {
        for (int j = 0; j < 1; j++) {
            System.out.println(str);
            try {
                Thread.sleep(time);
            } catch (Exception k) {
                System.out.println(k);
            }
        }

    }
    public static void main(String[] args) {
        // TODO code application logic here
        ThreeThread p1 = new ThreeThread("Hi", 1000);
        ThreeThread p2 = new ThreeThread("Hello", 2000);
        ThreeThread p3 = new ThreeThread("Good Morning", 3000);
        p1.run();
        p2.run();
        p3.run();
        
    }
    
}
