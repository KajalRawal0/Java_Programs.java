public class reactangle {
    
    public int length;
    public int bredth;

    //class to get area of rectangle

    public int area(){
        return length*bredth;
    }

    //class to get perimeter of rectangle

    public int perimeter(){
        return 2*(length + bredth);
    }


    //main class

        public static void main(String[] args) {
           //create objects for the classes
            reactangle r = new reactangle();

            r.bredth = 12;
            r.length = 11;

            System.out.println("Area :" +r.area());
            System.out.println("Perimeter :" +r.perimeter());
        }
}
