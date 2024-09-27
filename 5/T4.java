public class T4{ 
  public static void main(String args[]){
 int x = 0, p = 0, sum = 0;
 p = 1;
 x = 2;
 double q;
 sum = 0;
 while (p < 12){
      q =  x + p-(sum+7/3)/3.0%2 ;
      System.out.println("q="+q);
      sum = sum + (++x) + (int)q;
      System.out.println("sum="+sum);
      System.out.println(sum++);
      System.out.println("sum++="+sum);
      if (x > 5){
           p += 4/2;
           System.out.println("p if="+p);
        }
      else {
           p += 3%1;
           System.out.println("p else="+p);
        }
 }
 sum = sum + p;
 System.out.println(sum);
  }
}

