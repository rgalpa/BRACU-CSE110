public class task2{
  public static void main(String[]args){
//By Creating a third variable.
    int a = 5;
    int b = 10;
    System.out.println("Before Swap");
    System.out.println("a = "+a);
    System.out.println("b = "+b);
    int temp;
    
    temp = a;
    a = b;
    b = temp;
    System.out.println("After Swap By Creating a third variable");
    System.out.println("a = "+a);
    System.out.println("b = "+b);
    
//Without creating any other variables.
    int x = 5;
    int y = 10;
    System.out.println("Before Swap");
    System.out.println("x = "+x);
    System.out.println("y = "+y);
    x=x+y;
    y=x-y;
    x=x-y;
    System.out.println("After Swap Without creating any other variables");
    System.out.println("x = "+x);
    System.out.println("y = "+y);
  }
}