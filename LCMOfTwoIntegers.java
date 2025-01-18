// import java.util.Scanner;

// public class LCMOfTwoIntegers{

//     public static int gcd(int a, int b){
//         while (b!=0) {
//             int temp = b;
//             b = a % b;
//             a = temp;    
//         }
//        return a;  
//     }

//     public static int LCM(int a, int b){
//         return (a*b)/gcd(a, b);
//     }

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first digit:");
//         int a = sc.nextInt();

//         System.out.print("Enter second didgit:");
//         int b = sc.nextInt();

//         int result = LCM(a, b);
//         System.out.println("LCM of "+a+ " and "+b+ " is "+result);
        
//     }    
// }

import java.util.Scanner;

// Class to calculate LCM of two integers
public class LCMOfTwoIntegers {

    // Method to calculate the GCD (Greatest Common Divisor) of two integers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b; // Store the value of b
            b = a % b; // Calculate remainder
            a = temp; // Assign value of b to a
        }
        return a; // Return GCD
    }

    // Method to calculate the LCM (Least Common Multiple) of two integers
    public static int LCM(int a, int b) {
        return (a * b) / gcd(a, b); // Formula to calculate LCM using GCD
    }

    // Main method to get user input and display the LCM
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        System.out.print("Enter first digit: ");
        int a = sc.nextInt(); // Read first integer input from user

        System.out.print("Enter second digit: ");
        int b = sc.nextInt(); // Read second integer input from user

        int result = LCM(a, b); // Calculate the LCM of the two integers
        System.out.println("LCM of " + a + " and " + b + " is " + result); // Display the result
    }
}
