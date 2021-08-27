package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the radius of a circle:");
        Double circleRadius = input.nextDouble();

        // Double circleArea = 3.14 * circleRadius * circleRadius;
        Double circleArea = Circle.getArea(circleRadius);
        System.out.println("The area of a circle of radius " + circleRadius.toString() + " is: " + circleArea.toString());
    }
}
