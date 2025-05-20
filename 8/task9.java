import java.util.Scanner;
public class task9{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    double n = sc.nextDouble();
    int credit = sc.nextInt();
    
    if(n == 4.00 && credit >=30){
      System.out.println("The student is eligible for a waiver of 100 percent");
    }else if(n<=3.99 && n>=3.95 && credit >=30){
      System.out.println("The student is eligible for a waiver of 75 percent");
    }else if(n<=3.94 && n>=3.90 && credit >=30){
      System.out.println("The student is eligible for a waiver of 50 percent");
    }else if(n<=3.89 && n>=3.80 && credit >=30){
      System.out.println("The student is eligible for a waiver of 25 percent");
    }else{
      System.out.println("The student is not eligible for a waiver");
    }
  }
}