import java.util.Scanner;

public class greater_num {
    
    //Greater number between three digits

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        //Take value of a,b and c from user

        System.out.print("Enter value of a:");
        int a=sc.nextInt();

        System.out.print("Enter value of b:");
        int b=sc.nextInt();

        System.out.print("Enter value of c:");
        int c=sc.nextInt();

        //to check value of a 

        if((a>b) && (a>c)){
            System.out.println("a is greater");
        }

        //to check value of b
        
        else if((b>a) && (b>c)){
            System.out.println("B is greater");
        }
        else{
            System.out.println("c is greater");
        }

    }
}
