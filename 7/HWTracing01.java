import java.util.Scanner;
public class HWTracing01 {  
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
        //int count = 0;
        int len = str.length();
        String string ="";
        char character = str.charAt(0);
        int count = 0;
        for(int i = 0;i<len;i++){
          char a = str.charAt(i);
          if(a ==character){
            count++;
          }else{
            string += character + ""+count;
            character = a;
            count=1;
            }
          }
        //string += character + ""+count;
        
          System.out.println(string);
        
        
        
        
        
    }
}
        