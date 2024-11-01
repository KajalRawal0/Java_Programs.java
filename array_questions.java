import java.util.Scanner;

public class array_questions {

    //Declaring an array as a static class variable
    static int a[]={2,4,1,67,3,23,9,4};
    static Scanner sc =new Scanner(System.in);
       
    public static void main(String[] args) {
       
        Sum_of_Elements();
        findElement();
        maxElement();
    }
    
//function to find the sum of given array
    public static void Sum_of_Elements(){
        int sum=0;
        for(int i=0;i<a.length;i++){
          sum=sum+a[i];
        }
        System.out.println("Sum="+sum);
    }

 //function to find an element of given array
 
 public static void findElement(){
    System.out.print("Enter an element which you wanna find out from the array:");
        int n=sc.nextInt();

    for(int i=0;i<a.length;i++){
        if(n==a[i]){
            System.out.println("Element is found at "+i);
            System.exit(0);//to exit from the loop
        }   
    }
    System.out.println("Element is not avalilabe in the given array");
 }

 //method to get largest element from the given array

 public static void maxElement(){

    int max = a[0];
    for(int i=1;i<a.length;i++){
        if(a[i]>max){
            max=a[i];
            // System.exit(0);
        }
    }
    System.out.println("Largest number in given array is:"+max);

 }

}
