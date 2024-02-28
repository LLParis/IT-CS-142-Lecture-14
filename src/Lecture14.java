// London Paris
// IT-CS-142-Lecture-14

public class Lecture14 {

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Hello, world!");
    // SELF-CHECK PROBLEMS:
    // Note: you will need to put some of your answers inside a comments

    // Put your answer for #1 here:
    // Object-oriented programming creates objects that contain data and methods and you can use the objects
    // like building blocks to form structures and programs.

    // Procedural programming is when a set of tasks are completed in a linear or sequential fashion

    // Put your answer for #2 here:
    // An object is an instance of a class meaning it is a specific version of a class that is can be utilized
    // A class is a blueprint that we use to build our objects and give them functionality

    // Put your answer for #3 here:
    // The state of a String object refers to the data it holds at a given time.
    // The behavior of a String object refers to the methods and functionality it provides.

    // Put your answer for #5 here:
    // The state for the calculator would be the numbers that it is doing a calculation on.
    // The behavior for the calculator would be all of the calculations it can perform such as addition

    // Put your answer for #8 here:
    // An accessor method reads a value from an object without modifying it.
    // A mutator modifies the object's state/data

    // Put your answer for #7 here:
    Name name = new Name("John", "Q", "Public");

    // Put your answer for #11 here:
    System.out.println(name.getNormalOrder());
    System.out.println(name.getReverseOrder());

    // Put your answer for #14 here:
    Point point = new Point(7, 2);
    System.out.println(point.toString());

    // Put your answer for #15 here:
    System.out.println(name.toString());

    // Put your answer for #16 here:
    Point point1 = new Point(8, 2);
    Point point2 = new Point(4, 3);

    System.out.println("p1 is " + point1.toString()); // display the objects" state
    System.out.println ("p2 is " + point2.toString() ); // display the objects

    System.out.println( "p1's distance from origin is " + point1.distance(point2));

    point1.setLocation(5, 9);
    point2.setLocation(-1, 7);
    System.out.println("p1 is now" + point1.toString()); // display state again
    System.out.println ("p2 is now " + point2.toString());

    // EXERCISES:

    // Put your answer for #7 here:
    // You will need to add the method in Point.java,
    // and then create Point objects here to use (test) them
    Point point3 = new Point(-3, -3);
    Point point4 = new Point(3, -3);
    System.out.println(point1.quadrant());
    System.out.println(point2.quadrant());
    System.out.println(point3.quadrant());
    System.out.println(point4.quadrant());

    // Put your answer for #8 here:
    point1.flip();
    System.out.println(point1.toString());

  }
}
