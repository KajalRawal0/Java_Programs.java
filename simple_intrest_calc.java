import java.util.Scanner;

public class simple_intrest_calc {
    

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("CALCULATOR TO FIND OUT SIMPLE INTREST");

        System.out.print("Enter value of p:");
        int p=sc.nextInt();

        System.out.print("Enter valur of r:");
        int r=sc.nextInt();

        System.out.print("Enter value of t:");
        int t=sc.nextInt();

        int SI=(p*r*t)/100;
        System.out.println("Simple intrest is "+SI);


    }
}
