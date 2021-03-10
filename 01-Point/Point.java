class Main {
  public static void main(String[] args) {
    public final class Point{
      private int x;
      private int y;
    }
    public Point() {
      this(0, 0);
    }

    public Point(int x, int y){
      setLocation(x, y);
    }

    public double distanceFromOrigin(){
      return Math.sqrt(x*x + y*y);
    }

    public int getX(){
      return x;
    }

    public int getY(){
      return y;
    }

    public void setLocation(int x, int y){
      this.x = x;
      this.y = y;
    }

    public String toString() {
      return "(" + x + ", " + y + ")";
    }

    public void translate(int dx, int dy){
      setLocation(x + dx, y + dy);
    }

    public double distance(Point point){
      return Math.sqrt( Math.pow(x - point.getX(),2) + Math.pow(y - point.getY(),2));
    }

    public Point midpoint(Point point){
      return new Point((x + point.getX())/2 , (y + point.getY())/2);
    }

    public double slope(Point point){
      return ((y-point/getY()) / (x - point.getX()));
    }

    public boolean isCollinear(Point point1, Point point2){
      return this.slope(point1) == this.slope(point2);
    }
  }
}
