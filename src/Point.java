public class Point {
  int x;
  int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  public void setLocation(int newX, int newY) {
    x = newX;
    y = newY;
  }

  public void translate(int dx, int dy) {
    x = x + dx;
    y = y + dy;
  }

  // alternative solution that utilizes setLocation
  // public void translate(int dx, int dy) {
  // setLocation(x + dx, y + dy);
  // }

  public double distance(Point other) {
    int dx = x - other.x;
    int dy = y - other.y;
    return Math.sqrt(dx * dx + dy * dy);
  }

  public double distanceFromOrigin() {
    return Math.sqrt(x * x + y * y);
  }

  public String toString() {
    return "[x="+x+","+"y="+y+"]";
  }

  public int quadrant() {
    if (x > 0 && y > 0) {
      return 1;
    } else if (x < 0 && y > 0) {
      return 2;
    } else if (x < 0 && y < 0) {
      return 3;
    } else if (x > 0 && y < 0) {
      return 4;
    } else {
      return 0;
    }
  }

  public void flip() {
    int temp = x;
    x = -y;
    y = -temp;
  }

}
