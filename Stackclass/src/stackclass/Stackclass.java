
package stackclass;

class Stack {
  private int array[];
  private int t;
  private int capacity;

  Stack(int size) {
    array = new int[size];
    capacity = size;
    t = -1;
  }

  public int push(int x) {
    if (t == capacity - 1) {
      System.out.println("Stack is OverFlow.");
      return 0;
    } else {
      if (x == 0) {
        return 0;
      } else if (x % 5 == 0) {
        System.out.println("Inserting data " + x);
        array[++t] = x;
        return x;
      } else {
        return 0;
      }
    }
  }

  public int pop() {
    int i, j, pop_value;

    if (t == -1) {
      System.out.println("Stack is Empty.");
      return 0;
    } else if (array[t] % 3 == 0) {
      pop_value = array[t];
      t--;
      return pop_value;
    } else {
      for (i = t - 1; i >= 0; i--) {
        if (array[i] % 3 == 0) {
          pop_value = array[i];
          for (j = i; j <= t; j++) {
            array[j] = array[j + 1];
          }
          t--;
          return pop_value;
        }
      }                                                                                                                                                                                                                                          
    }
    return 0;
  }

  public void printStack() {
    for (int i = 0; i <= t; i++) {
      System.out.print(array[i] + "  ");
    }
    System.out.print("\n");
  }
}


public class Stackclass {

    public static void main(String[] args) {
         Stack stack = new Stack(6);

    stack.push(5);
    stack.push(10);
    stack.push(15);
    stack.push(571);
    stack.push(20);
    stack.push(81);
    stack.push(45);
    
    System.out.print("Stack: ");
    stack.printStack();

    System.out.print("Pop Value is : " + stack.pop() + "\n");
    System.out.print("Pop Value is : " + stack.pop() + "\n");

    System.out.print("\nStack value is : ");
    stack.printStack();
    }
    
}
