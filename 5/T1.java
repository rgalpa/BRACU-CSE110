public class T1 {
  public static void main(String args[]) {
 int x = 0, i = 0, sum = 0;
 i = 1;
 x = 2;
 sum = 0;
 while (i < 20){
      x = x + i;
      System.out.println("x="+x);
      sum = sum + x + 1;
      System.out.println("sum1="+sum);
      if (x > 5){
          i += 2;
          System.out.println("i if="+i);
        }
      else {
          i += 3;
          System.out.println("i else="+i);
        }
 }
 sum = sum + i;
 System.out.println("sum2="+sum);
  }
}

