package codegym;

import java.util.Scanner;

public class TriangleTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean enterrepeatSides = true;

        do {
            System.out.println("Enter three side of the triangle: ");
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            double side3 = scanner.nextDouble();

            try {
                Triangle triangle = new Triangle(side1, side2, side3);
                enterrepeatSides = false;
                System.out.println(triangle.toString());
                System.out.println("Area: " + triangle.getArea());
                System.out.println("Perimeter: " + triangle.getPerimeter());
            } catch (IllegalTriangleException ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        } while (enterrepeatSides);

    }
}
