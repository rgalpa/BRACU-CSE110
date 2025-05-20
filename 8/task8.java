import java.util.Scanner;
public class task8{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int id = sc.nextInt();
    int a = id/1000000;
    int b = id/100000;
    int c = b%10;
    
    if(c == 1){
      System.out.println("Student Joined BRAC in Spring "+a);
    }else if(c == 2){
      System.out.println("Student Joined BRAC in Fall "+a);
    }else if(c == 3){
      System.out.println("Student Joined BRAC in Summer "+a);
    }else{
    }
  }
}