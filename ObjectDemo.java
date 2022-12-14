class Point{
    private int x;
    private int y;
    public Point(){
        x = y = 0;
    }

    public Point(int x_){
        x = y = x_;
    }

    public Point(int x_, int y_){
        x = x_;
        y = y_;
    }

    public String toString(){
        //(1, 2)
        return "(" + x + ", " + y + ")";
    }

    public void setX(int x_){
        x = x_;

    }

    public void setY(int y_){
        y = y_;
    }
}

public class ObjectDemo{
    
    
    public static void changePoint(Point p){
        p.setX(100);
        p.setY(200);
    }
   public static void main(String[] args){
        Point p1 = new Point(1,2);
        System.out.println("Before: " + p1.toString());
        changePoint(p1);
        System.out.println("After: " + p1.toString());


   }

}   