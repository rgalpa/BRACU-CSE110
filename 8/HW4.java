import java.util.Scanner;
public class HW4{
    public static void main (String [] args){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the length of array: ");
        int length= sc.nextInt();
        int [] array= new int[length];
        System.out.println("Please enter the elements of the array ");
        for(int i=0; i<=length-1; i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Please enter the target value: ");
        int count=0;
        int target= sc.nextInt();
        
        for(int i=0; i<=length-1; i++){
            for(int j=0;j<=length-1;j++){
                if(j!=i&&array[i]+array[j]==target){
                    System.out.println("Elements need to be added: "+array[i]+" "+array[j]);
                    System.out.println("Index of the elements: "+i+" and "+j);
                    count++;
                }
            }
            if(count>=1){
                break;
            }
        }
        if(count==0){
                System.out.println("Target value not found");
            }    
        sc.close ();
    }
}