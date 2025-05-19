import java.util.Scanner;
public class array1234{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    int arr [] = new int[length];
    
    for(int i=0;i<length;i++){
      arr[i]=sc.nextInt();
    }
    int max = arr[0];
    int maxIndex=0;
    for(int i=1;i<length;i++){
      if(arr[i]>max){
        max= arr[i];
        maxIndex= i;
      }
    }
    int sum=0;
    for(int i=0;i<length;i++){
      sum+=arr[i];
    
    }
    System.out.print(max + "  "+ maxIndex);
    System.out.println();
    System.out.println(sum);
  }
}