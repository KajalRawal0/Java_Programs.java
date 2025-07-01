// package ApnaCollage;

// import java.util.Scanner;

// public class linearSearch {

//     public static void linear(int numbers[], int key, int l){

//        boolean found = false;
//         for( int i = 0; i < l; i++){
//             if(numbers[i] == key){
//                 System.out.println("NUmber is found at:" +i);
//                 found = true;
//                 break;
//             }
//             if(!found){
//                 System.out.println("Not found");
//             }
//         }
//     }
    
//   public static void main(String[] args) {
    
//     Scanner sc = new Scanner(System.in);

//     System.out.print("Enter the limit of the numbers:");
//     int l = sc.nextInt();
//     int numbers[] = new int[l];


//     System.out.println("Enter " +l + " numbers" );
//     for(int i = 0; i < l; i++){
//         numbers[i] = sc.nextInt();
//     }

//     System.out.println("Entered numbers are");

//     for( int i = 0; i < l; i++){
//         System.out.print(numbers[i] +" ");
//     }
//     System.out.println();

//         System.out.print("Enter the key you wanna search:");
//         int key = sc.nextInt();

//         linear(numbers, key, l);
    

//     }   
// }

package ApnaCollage;

import java.util.Scanner;

public class linearSearch {  // Class names should start with uppercase letter

    public static void linear(int numbers[], int key, int l) {
        boolean found = false;
        for (int i = 0; i < l; i++) {
            if (numbers[i] == key) {
                System.out.println("Number is found at index: " + i);
                found = true;
                break;  // Remove break if you want all occurrences
            }
        }
        if (!found) {  // Moved outside the loop
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit of the numbers: ");
        int l = sc.nextInt();
        int[] numbers = new int[l];  // Dynamic size based on user input

        System.out.println("Enter " + l + " numbers");
        for (int i = 0; i < l; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Entered numbers are:");
        for (int i = 0; i < l; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();  // New line after printing numbers

        System.out.print("Enter the key you want to search: ");
        int key = sc.nextInt();

        linear(numbers, key, l);
    }
}