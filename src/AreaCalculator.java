/* Author: Randall Carbonel
 * Date: 7/20/24
 * Class: ASD216 - Java Programming
 * Assignment: Create an application that calculates the area of various shapes.
 * Specifications:
 *      - Create an abstract class named Shape that contains:
 *          - An abstract method named getArea()
 *          - A default method that overrides the toString() method and returns a string that includes the value
 *            returned by the getArea() method
 *      - Create a class named Circle that inherits the Shape class and contains these constructors and methods:
 *          - public Circle(double radius)
 *          - public double getRadius()
 *          - public void setRadius(double radius)
 *          - public double getArea()
 *      - Create a class named Square that inherits the Shape class and contains these constructors and methods:
 *          - public Square(double width)
 *          - public double getWidth()
 *          - public void setWidth(double width)
 *          - public double getArea()
 *      - Create a class named Rectangle that inherits the Square class and contains these constructors and methods:
 *          - public Rectangle(double width, double height)
 *          - public double getHeight()
 *          - public void setHeight(double height)
 *          - public double getArea()
 *      - Use the following formulas to calculate area:
 *          - Circle: Area = radius^2 * pi
 *          - Square: Area = width^2
 *          - Rectangle: Area = width * height
 *      - Use the Console class presented in chapter 7 or an enhanced version of it to get and validate the user’s
 *        entries.
 *      - Assume the user will enter a valid shape type.
 */

public class AreaCalculator {

    public static void greeter() {
        System.out.println("Welcome to the Area Calculator");
    }

    public static void main(String[] args) {

        greeter();

        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {

            String shapeType = Console.getString("Calculate area of a circle, square, or rectangle? (c/s/r): ");
            Shape shape;

            switch (shapeType) {
                case "c":
                    double radius = Console.getDouble("Enter radius: ");
                    shape = new Circle(radius);
                    break;

                case "s":
                    double width = Console.getDouble("Enter width: ");
                    shape = new Square(width);
                    break;

                case "r":
                    double rWidth = Console.getDouble("Enter width: ");
                    double height = Console.getDouble("Enter height: ");
                    shape = new Rectangle(rWidth, height);
                    break;

                default:
                    System.out.println("Invalid Shape type.");
                    continue;
            }

            System.out.println(shape.toString());
            choice = Console.getString("Continue? (y/n): ");
        }
    }
}
