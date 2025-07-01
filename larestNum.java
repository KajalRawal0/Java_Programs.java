package ApnaCollage;

import java.util.Scanner;

public class larestNum {

    public static int LargestNum(int numbers[], int l){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < l; i++){
        if( largest < numbers[i]){
            largest = numbers[i];
        }
    }
        return largest;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter limit of the array: ");
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
        

        int n = LargestNum(numbers, l);

        System.out.println("Largest value is:" +n);
    }
}
