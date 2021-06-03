package thread;
import java.util.Scanner;

class program {
    int n;
    int i;
    int sum = 0;
    float avg = 0;

    program(int y1) {
        n = y1;
    }

    public void numbers() {
        System.out.println("Enter the number " + n);
        for (int k = 1; k <= n; k++) {
            System.out.println(k);
        }
    }

    public void evennumbers() {
        System.out.println("Even numbers: ");
        for (int k = 1; k <= n; k++) {
            if (k % 2 == 0) {
                System.out.println(k + " ");
            }
        }
    }

    public void oddnumbers() {
        System.out.println("Odd numbers: ");
        for (int k = 1; k <= n; k++) {
            if (k % 2 != 0) {
                System.out.println(k + " ");
            }
        }
    }

    public void average() {
        for (int k = 1; k <= n; k++) {
            sum = sum + k;
        }
        avg= (float) sum / n;
        System.out.println("Average : "+ avg);
    }
}
 class thread1 extends Thread{
    Thread i;
    program y;

    thread1(program f1) {
        y = f1;
        i = new Thread(this);
        i.run();
    }

    public void run() {
        y.numbers();
    }
}
 class thread2 extends Thread{
     Thread i;
    program y;

    thread2(program f1) {
        y = f1;
        i = new Thread(this);
        i.run();
    }

    public void run() {
        y.evennumbers();
    }
}

 class thread3 extends Thread{
      Thread i;
    program y;

    thread3(program f1) {
        y = f1;
        i = new Thread(this);
        i.run();
    }

    public void run() {
        y.oddnumbers();
    }
}

 class thread4 extends Thread{
      Thread i;
    program y;

    thread4(program f1) {
        y = f1;
        i = new Thread(this);
        i.run();
    }

    public void run() {
        y.average();
    }
}
public class Thread {


    public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        program e = new program(n);
        thread1 i1 = new thread1(e);
        thread2 i2 = new thread2(e);
        thread3 i3 = new thread3(e);
        thread4 i4 = new thread4(e);
    }

    
}
