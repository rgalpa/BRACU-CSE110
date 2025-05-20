import java.util.Scanner;
public class HW3{
    public static void a (String [] args){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the length of array 1: ");
        int length= sc.nextInt();
        int [] a= new int[length];
        System.out.println("Please enter the elements of the arr1 ");
        for(int i=0; i<=length-1; i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Please enter the length of array 2: ");
        length= sc.nextInt();
        int [] subset= new int[length];
        System.out.println("Please enter the elements of the arr2: ");
        for(int i=0; i<=length-1; i++){
            subset[i]= sc.nextInt();
        }
        int count=0;
        for(int i=0; i<=subset.length-1; i++){
            for(int j=0; j<=a.length-1; j++){
                if(subset[i]==a[j]){
                    count++;
                    break;
                }
            }
        }
        if(count==subset.length){
            System.out.println("Array 2 is a subsetset of Array 1.");
        }
        else{
            System.out.println("Array 2 is not a subsetset of Array 1.");
        } 
        sc.close();
    }
}