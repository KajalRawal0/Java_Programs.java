package ApnaCollage;

import java.util.Scanner;

public class reverseArray {
    
    public static void ReversedArray(int numbers[]){

        int start = 0, end = numbers.length - 1;

        while(start < end){
            //swapping

            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

        System.out.print("Enter limit of an array:");
        int l = sc.nextInt();
        int numbers[] = new int[l];

        System.out.println("Enter array elements:");
        for(int i = 0; i < l; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Array elements: ");
        for(int i = 0; i < l; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("Reversed array is");

        ReversedArray(numbers);

        for( int i = 0; i < l; i++){
            System.out.print(numbers[i] +" ");
        }
    }
}
