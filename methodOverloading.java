public class methodOverloading {
    

     static int max(int x, int y){
        return x>y?x:y;
    }

    static float max(float x, float y){
        return x>y?x:y;
    }

    static int max(int x, int y, int z){
       if((x>y) && (x>z))
       return x;
       else if (y>z)
        return y;
       else
       return z;
    }

    public static void main(String[] args) {
        
        System.out.println(max(10, 32));
        System.out.println(max(32.4f, 0.323f));
        System.out.println(max(32, 43, 34));
    }
}
