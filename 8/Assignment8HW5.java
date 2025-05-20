import java.util.Scanner;
public class Assignment8HW5{
    public static void main (String [] args){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("N: ");
        int length= sc.nextInt();
        int [] array= new int[length];
        for(int i=0; i<=length-1; i++){
            System.out.println("Enter a number: ");
            array[i]= sc.nextInt();
        }
        System.out.println("Original Array: ");
        for(int i=0; i<=length-1; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();  
        int a=0;
        for(int i=0; i<=length-1; i++){
            for(int j=i+1; j<=length-1;j++){
                if(array[j]>array[i]){
                    a=array[i];
                    array[i]=array[j];
                    array[j]=a;
                }
            }
        }
        System.out.println("Sorted Array: ");
        for(int i=0; i<=length-1; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(); 
        sc.close();
    }
}