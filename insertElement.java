import java.util.Scanner;

public class insertElement {
    static Scanner sc = new Scanner(System.in);
    static int[] a = new int[50];
    static int n, i, k, m;

    public static void main(String[] args) {
        // Insert an array using the keyboard
        System.out.print("Enter the limit of the array: ");
        n = sc.nextInt();
        System.out.println("Enter " + n + " elements");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        insertElement(); // Call the method to insert an element
        deleteInsert();// Call the method to delete an element
    }

    // Method to insert an element
    public static void insertElement() {
        System.out.print("\nEnter an element which you wanna insert in the array: ");
        k = sc.nextInt();

        System.out.print("Enter the index where you wanna store your element: ");
        m = sc.nextInt();

        for (i = n; i > m; i--) {
            a[i] = a[i - 1];
        }

        a[m] = k;
        n++; // Increment the number of elements in the array

        // Printing the new array
        System.out.print("Updated array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }


    //method to delete aan element from the array

    public static void deleteInsert(){

        System.out.print("\nEnter the index on which you wanna delete an element:");
        int d = sc.nextInt();

        for(i = d; i < n; i++){
            a[i] = a[i+1];
        }
        //printing updated array
        for(i = 0; i<n-1;i++){
            System.out.print(a[i]+" ");
        }

    }
}
