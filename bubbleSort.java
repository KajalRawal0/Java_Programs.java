import java.util.Scanner;

public class bubbleSort {

    public static void Bubble_sort(int a[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("\nAfter Bubble Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void SelectionSort(int a[], int n) {

        // Now apply selection sort
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }

        System.out.println("\nAfter Selection Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit of an array: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Before sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        SelectionSort(a, n);
    }
}
