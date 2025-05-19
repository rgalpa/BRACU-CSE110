import java.util.Scanner;
public class Str01 {
    
      public static boolean oneToN(int a, int b){
        int sum = a + b;
        if (sum==10){
          return true;
        }else{
          return false;
        }
      }
      
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      boolean result = oneToN(sc.nextInt(),sc.nextInt());
      System.out.println(result);
    }
      
}

