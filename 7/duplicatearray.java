import java.util.Scanner;
public class duplicatearray{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    int arr [] = new int[length];
    
    for(int i=0;i<length;i++){
      arr[i]=sc.nextInt();
    }
    
    int count = 0;
    for(int i=0;i<length;i++){
      for(int j=i+1;j<length;j++){
        if(arr[i] == arr[j]){
          count++;
        }
      }
    }
    System.out.println(count);
    int arr2 [] = new int[length-count];
    int a = 0;
    for(int i=0;i<length-1;i++){
      for(int j=a;j<length;j++){
        if(arr[j] != 0){
          arr2[i]=arr[j];
          a=j+1;
          break;
        }
      }
    }
    for(int i=0;i<length-count;i++){
      System.out.print(arr2[i]+ "  ");
    }
    //System.out.println();
    
    

  }
}