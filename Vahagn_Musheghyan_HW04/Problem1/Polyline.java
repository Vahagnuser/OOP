package Vahagn_Musheghyan_HW04.Problem1;

public class Polyline {
    private Point [] points;
    private int index;
    private int capacity=100;

    public Polyline()
    {
        this.points=new Point[capacity];
        this.index=0;
    }
    //Copy constructer
    public  Polyline(Polyline ob)
    {
        this.points = new Point[100];
        this.index = ob.index;
        for (int i = 0; i < ob.index; i++) {
            this.points[i] = new Point(ob.points[i].getX(), ob.points[i].getY());
        }

    }
    public void add(Point p){
        points[index++] = new Point(p.getX(), p.getY());
    }
    // Accessor method to get the points
    public Point[] getPoints() {
        Point[] result = new Point[index];
        for (int i = 0; i < index; i++) {
            result[i] = new Point(points[i].getX(), points[i].getY());
        }
        return result;
}
 // Mutator method to set the points
 public void setPoints(Point[] p) {
    
    this.index = p.length;
    for (int i = 0; i < p.length; i++) {
        this.points[i] = new Point(p[i].getX(), p[i].getY());
    }
}
// Method to calculate the total length of the polyline
public double getTotalLength() {
    if (index < 2) {
        return 0;
    }
    double totalLength = 0;
    for (int i = 0; i < index - 1; i++) {
        totalLength += Point.DistanceBetween(points[i], points[i + 1]);
    }
    return totalLength;
}
public String toString() {
    String sb = new String();
    for (int i = 0; i < index; i++) {
        sb+=points[i].toString();
        if (i < index - 1) {
            sb+=" -> ";
        }
    }
    return sb.toString();
}
}