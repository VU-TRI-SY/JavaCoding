class Point{
    private int x;
    private int y;
    public Point(){
        x = y = 0;
    }

    public Point(int x){
        this.x = x;
        this.y = x;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    public void setX(int x){
        this.x = x;

    }

    public void setY(int y){
        this.y = y;
    }
}

public class ObjectDemo{
    
    
    public static void changePoint(Point p){
        p.setX(100);
        p.setY(200);
    }
   public static void main(String[] args){
    // Trong java, một string là constant--> không thể thay đổi giá 
    // trị của string
        // Point p1 = new Point(1,2);
        // System.out.println("Before: " + p1.toString());
        // changePoint(p1);
        // System.out.println("After: " + p1.toString());

        String s1 = "Hello"; //constant string
        // String s2 = "Hello";
        // String s3 = s1;
        // s2 = "world";
        // s1[0] = 'a';
        for(int i = 0; i < s1.length(); i++){
            System.out.println(s1.charAt(i));
        }
        // String s1 = new String("Hello"); //object string
        // String s2 = new String("Hello");
        // System.out.println(s1.equals(s2));
        //String pool and string object
        //so sanh 2 constan string ==
        //so sanh 2 object string: equals();
   }

}   