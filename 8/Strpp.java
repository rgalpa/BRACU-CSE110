import java.util.Scanner;
public class Strpp {
  
      public static void even(int a1[]){
        for(int i = 0;i<a1.length;i++){
          a1[i] = i+1;
          System.out.print(a1[i]+" ");
        }
      }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int length = sc.nextInt();
      int arr [] = new int[length];
      
      even(arr);
    }
}
