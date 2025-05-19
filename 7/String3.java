import java.util.Scanner;
public class String3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String ch = sc.next();
        int a = ch.length();
        //int c = 0;
        
        for(int i=0; i<a; i++){
          int b = (int)ch.charAt(i);
          if(b==64){
            System.out.println();
          }else{
            System.out.print((char)b);
          }
        }
        
        
        sc.close();
    }
}