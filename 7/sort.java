import java.util.Scanner;
public class sort{
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in); 
        char [] arr = {'A', 'A', 'A', 'B', 'C', 'U', 'Z'};
        int len = arr.length;
        for(int i = 0 ; i<len; i++){
          char a = arr[i];
          
          if(a=='A'){
            System.out.println("100");
            
          }else if(a=='B'){
            System.out.println("90");
            
          }else if(a=='C'){
            System.out.println("70");
            
          }else {
            System.out.println("0");
            
          }
        }
        
        
    }
}
   