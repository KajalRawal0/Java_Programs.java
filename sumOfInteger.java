import java.util.Scanner;

public class sumOfInteger{

    public static int sum(int a){
        int s = 0;
        for(int i=1; i<=a; i++){
            s = s+i;
        }
        return s;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any digit:");
        int a = sc.nextInt();
        int result = sum(a);
        System.out.println("Sum of "+a+ " integer number is "+result);
    }
}