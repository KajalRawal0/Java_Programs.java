import java.util.Scanner;

public class circleClass {
    
    
        public double radius;

        //class to get area of circle
        public double area(){
            return Math.PI*radius*radius;
        }

        //class to get perimeter of circle

        public double perimeter(){
            return 2*Math.PI*radius;
        }

        //class to get circumference of circle

        public double circumference(){
            return perimeter();
        }


//create object in main method
    public static void main(String[] args) {

        circleClass c = new circleClass();

        c.radius= 7;

        System.out.println("Area :" +c.area());
        System.out.println("Perimeter :" +c.perimeter());
        System.out.println("Circumference :" +c.circumference());

    }
}
