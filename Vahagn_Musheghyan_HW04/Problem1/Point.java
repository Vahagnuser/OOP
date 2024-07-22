package Vahagn_Musheghyan_HW04.Problem1;
;
public class Point {
    
    private double x;
    private double y;
    public Point(double x,double y)
    {
        this.x=x;
        this.y=y;

    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public String toString()
    {
        return "["+x+","+y+"]";

    }
    public static double DistanceBetween(Point p1,Point p2)
    {
        double dx = p1.getX() - p2.getX();
        double dy = p1.getY() - p2.getY();

        return Math.sqrt(dx * dx + dy * dy);
    }
    public double Distance(Point ob)
    {
        double dx = this.getX() - ob.getX();
        double dy = this.getY() - ob.getY();

        return Math.sqrt(dx * dx + dy * dy);
    }
    

}
