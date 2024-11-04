import java.util.Scanner;

// public class prime_num {
    

//     static boolean isPrime(int n){
//         for(int i=2;i<n/2;i++){
//             if(n%i==0){
//                 return false;
//             }
//             return true;
//         }

//     }
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
 
//         // System.out.print("Enter a number:");
//         // int n=sc.nextInt();
//         System.out.println(isPrime(41));
//     }
// }import java.util.Scanner;

public class prime_num {

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true; // If no divisors found, it's a prime number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
