package ApnaCollage;

import java.util.Scanner;

public class binarySearch {

    public static int Binary_search(int numbers[], int key){

        int start = 0, end = numbers.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(numbers[mid] == key){
                return mid;
            }

            if( numbers[mid] < key){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter limit of an array:");
         int l = sc.nextInt();
         int numbers[] = new int[l];

         for( int i = 0; i <= l; i++){
            numbers[i] = sc.nextInt();
         }

         for(int i = 0; i <= l; i++){
            System.out.print(numbers[i]);
         }
         System.out.println();

         System.out.print("Enter key you wanna search:");
         int key = sc.nextInt();

         System.out.print("Index for key is: " +Binary_search(numbers, key));

    }
}


// package ApnaCollage;

// import java.util.Scanner;

// public class binarySearch {
//     public static int Binary_search(int numbers[], int key) {
//         int start = 0, end = numbers.length - 1;

//         while(start <= end) {
//             int mid = (start + end) / 2;

//             if(numbers[mid] == key) {
//                 return mid;
//             }

//             if(numbers[mid] < key) {
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter limit of an array:");
//         int l = sc.nextInt();
//         int numbers[] = new int[l];

//         System.out.println("Enter array elements:");
//         for(int i = 0; i < l; i++) {
//             numbers[i] = sc.nextInt();
//         }

//         System.out.print("Array elements: ");
//         for(int i = 0; i < l; i++) {
//             System.out.print(numbers[i] + " ");
//         }
//         System.out.println();

//         System.out.print("Enter key you wanna search:");
//         int key = sc.nextInt();

//         System.out.print("Index for key is: " + Binary_search(numbers, key));
//     }
// }