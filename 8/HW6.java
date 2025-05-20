import java.util.Scanner;
public class HW6{
    public static void main (String [] args){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Number of students: ");
        int length= sc.nextInt();
        int [] marks= new int[length];
        String [] names= new String[length];    
        for(int i=0; i<=length-1; i++){
            System.out.println("Name of the student: ");
            names[i]= sc.next();
            System.out.println("His/Her marks: ");
            marks[i]= sc.nextInt();
        }
        System.out.println();  
        int a=0;
        String s="";
        for(int i=0; i<=length-1; i++){
            for(int j=i+1; j<=length-1;j++){
                if(marks[j]<marks[i]){
                    a=marks[i];
                    s=names[i];
                    marks[i]=marks[j];
                    names[i]=names[j];
                    marks[j]=a;
                    names[j]=s;
                }
            }
        }
        System.out.println("Sorted Array: ");
        for(int i=0; i<=length-1; i++){
            System.out.print(marks[i]+" ");  
        }
        System.out.println();
        for(int i=0; i<=length-1; i++){
            System.out.print(names[i]+" ");    
        }
        System.out.println(); 
        sc.close();
    }
}