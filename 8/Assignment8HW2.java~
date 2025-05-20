import java.util.Scanner;
public class Assignment8HW2{
    public static void main (String [] args){
        int count=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length= sc.nextInt();
        
        int [] array1= new int[length];
        for(int i=0; i<=length-1; i++){
            System.out.println("Enter a number: ");
            array1[i]= sc.nextInt();
        }
        System.out.println("Input array:" );
        for(int i=0; i<=length-1; i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        
        for(int i=0; i<=length-1; i++){
            for(int j=i+1; j<=length-1; j++){
                if(array1[i]==array1[j]){
                    count++;
                }
            }
        }
        
        
        
        for(int i=0; i<=length-1; i++){
            for(int j=i+1; j<=length-1; j++){
                if(array1[i]==array1[j]){
                    array1[j]=0;
                }
            }
        }
        
        int a=0;
        int [] array2= new int[length-count];
        for(int i=0; i<=array2.length-1; i++){
            for(int j=a; j<=length-1; j++){
                if(array1[j]!=0){
                    array2[i]=array1[j];
                    a=j+1;
                    break;
                }
            }   
        }
        System.out.println("New array:");  
        for(int i=0; i<=length-count-1; i++){
            System.out.print(array2[i]+" ");
        }
        System.out.println();
        sc.close();        
    }
}