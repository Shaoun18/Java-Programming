package division;
class division {
  private double result;

  public double div(int k, int l) {
    if (k < l) {
      return 0;
    } else {
      result = k / l;
      return result;
    }
  }
  public double div(int k, double l) {
   if (k < l) {
      return 0;
    } else {
      result = k / l;
      return result;
    }
  }

  public double div(double k, int l) {
    if (k < l) {
      return 0;
    } else {
      result = k / l;
      return result;
    }
  }

  public double div(double k, double l) {
     if (k < l) {
      return 0;
    } else {
      result = k / l;
      return result;
    }
  }
}

public class Division {
    public static void main(String[] args) {      
         division ob1 = new division();

    System.out.println(ob1.div(12,2));
    System.out.println(ob1.div(460, 21.6));
    System.out.println(ob1.div(569.9, 51));
    System.out.println(ob1.div(953.35, 359.95));
    }
    
}
