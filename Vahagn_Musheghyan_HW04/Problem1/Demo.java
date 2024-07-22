package Vahagn_Musheghyan_HW04.Problem1;

public class Demo {
    public static void main(String[] args) {
        // Create some Point objects
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(5, 6);

        // Display the points
        System.out.println("Point p1: " + p1);
        System.out.println("Point p2: " + p2);
        System.out.println("Point p3: " + p3);

        // Calculate and display the distance between two points
        double distance = Point.DistanceBetween(p1, p2);
        System.out.println("Distance between p1 and p2: " + distance);

        // Create a Polyline and add points to it
        Polyline polyline = new Polyline();
        polyline.add(p1);
        polyline.add(p2);
        polyline.add(p3);

        // Display the polyline
        System.out.println("Polyline: " + polyline);

        // Calculate and display the total length of the polyline
        double totalLength = polyline.getTotalLength();
        System.out.println("Total length of the polyline: " + totalLength);

        // Create a copy of the polyline
        Polyline polylineCopy = new Polyline(polyline);
        System.out.println("Copy of the polyline: " + polylineCopy);

        // Modify the original polyline and show that the copy remains unchanged
        polyline.add(new Point(7, 8));
        System.out.println("Modified original polyline: " + polyline);
        System.out.println("Unchanged copy of the polyline: " + polylineCopy);

        // Show the points in the polyline
        Point[] points = polyline.getPoints();
        System.out.print("Points in the polyline: ");
        for (Point point : points) {
            System.out.print(point + " ");
        }
        System.out.println();

        // Set new points to the polyline and display it
        Point[] newPoints = { new Point(10, 10), new Point(20, 20) };
        polyline.setPoints(newPoints);
        System.out.println("Polyline after setting new points: " + polyline);
    }
}
