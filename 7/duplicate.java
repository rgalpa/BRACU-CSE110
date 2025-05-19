import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string_one = sc.nextLine();
        String string_two = sc.nextLine();
        

        for (int i = 0; i < string_two.length(); i++) {
            int a = (int)string_two.charAt(i);
            for (int j = i+1; j < string_one.length(); j++) {
              int b = (int)string_one.charAt(j);
              if(a==b){
                //System.out.print((char)a);
              }else{
                System.out.print((char)b);
                //j=string_one.length();
              }
              
            }
        }
        
        
    }
}
            
