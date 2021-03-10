public class driver {
  public static void main(String[] args) {
    point.add(new Point(1.0, 4.0));
    point.add(new Point(2.0, 2.0));
    point.add(new Point(3.0, 5.0));
    point.add(new Point(4.0, 3.0));
    System.out.prinln(point);

    System.out.println(point1.distanceFromOrigin());
    System.out.println(point2.distanceFromOrigin());
    System.out.println(point1.midpoint(2,9));
    System.out.println(point2.slope(2,9));
    System.out.println(point1.isCollinear(1,2,3,4));
  }
}
