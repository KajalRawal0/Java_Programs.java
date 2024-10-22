import java.util.Scanner; // importing scanner from java used to take user inputs

public class calc {  // creating java class name calc

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

          int c=0,operator,a,b;
        // using println for always taking new line 
        System.out.println("1.  For addition\n 2.  For subtraction\n 3.  For Multiplication\n 4.  For division");
        
        System.out.print("Select the operator which you wanna perform:");
        operator=sc.nextInt();
        System.out.print("Enter first value:");
         a=sc.nextInt();

        System.out.print("Enter second value:");
         b=sc.nextInt();

 // used switch case for checking the conditions
        switch(operator) {
            case 1:
                c=a+b;
                break;
            case 2:
                 c=a-b;
                 break;
            case 3:
                c=a*b;
                 break;
            case 4:
                 c=a+b;
                break;
            default:
            System.out.println("Enter valid operator");  
                break;
        }
        System.out.println("Output is " +c);  // printing output 
    }
}
