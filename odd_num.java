import java.util.Scanner;

public class odd_num {
    
    public static void main(String[] args) {
        
       
        Scanner sc=new Scanner(System.in);

       //Programe to get odd numbers from 1-100 using for loop

    
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }

 
        //Programe to get odd numbers from 1-100 using for loop

        int n=1;
        while(n<=100){


            if(n%2!=0){
                System.out.println(n);
            }
            n++;
        }

    }
}
