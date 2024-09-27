public class T3{ 
  public static void main(String args[]){
 int x = 0, y = 0;
 int sum = 0;
 while (x < 10){
     y = x - 3;
     System.out.println("y="+y);
     y = 40;
     System.out.println("y="+y);
     while (y > 22){
         if ((sum > 30) && (sum < 40)){
         sum = sum + x * 2 ;
         System.out.println("sum if="+sum);
         }
         else if ((sum > 40) && (sum < 50)){
         sum = sum + x * 3;
         System.out.println("sum else if="+sum);
         }
         else {
         sum = sum + 23;
         System.out.println("sum else="+sum);
         }
         System.out.println("sum="+sum);
         y = y - 10;
         System.out.println("y="+y);
     }
     x += 2;
     System.out.println("x="+x);
 }
  }
}

