import java.util.Scanner;

public class Rotation_of_array {
    
//decalration of an array as a global variable
    static int a[]={3,5,7,8,4,1,0,12,45,23,9,46};
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        leftRotation();
        rightRotation();
    }

//method to get left rotation of given array
    public static void leftRotation(){
        System.out.println("Before Left Rotation");
        for(int x:a){
            System.out.print(x+",");
            // System.out.println();
        }
        System.out.println("\nAfter Left Rotation");
        int temp=a[0];
        for(int i=1;i<a.length;i++){
            a[i-1]=a[i];
        }
        a[a.length-1]=temp;
        for(int x:a){
            System.out.print(x+",");
            // System.out.println();
        }
    }

    //method to get right rotation of given array
    public static void rightRotation(){
        System.out.println("\nBefore Right Rotation");
        for(int x:a){
            System.out.print(x+",");
            // System.out.println();
        }
        System.out.println("\nAfter Right Rotation");
        int temp=a[a.length-1];
        for(int i=a.length-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=temp;
        for(int x:a){
            System.out.print(x+",");
            // System.out.println();
        }
    }

}
