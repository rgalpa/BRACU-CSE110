import java.util.Scanner;
public class sortstr{
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in); 
        int [] mark = {5,2,1,4,3};
        String [] names = {"E","B","A","D","C",};
        int len1 = mark.length;
        //int len2 = names.length;
        
        int temp1 = 0;
        String temp2 = "";
        for(int i = 0 ; i<len1; i++){
          for(int j = i+1 ; j<len1; j++){
          if(mark[i]>mark[j]){
            temp1=mark[i];
            mark[i]=mark[j];
            mark[j]=temp1;
            
            temp2=names[i];
            names[i]=names[j];
            names[j]=temp2;
            
            
          }
          }
        }
        
        for(int i = 0 ; i<len1; i++){
          System.out.print(mark[i]+ " ");
          
          System.out.print(names[i]+ " ");
          System.out.println();
        }
        
    }
}
   