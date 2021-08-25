package exercises;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of your rectangle?");
        Double rectLength = input.nextDouble();

        System.out.println("What is the width of your rectangle?");
        Double rectWidth = input.nextDouble();

        Double rectArea = rectLength * rectWidth;
        System.out.println("The area of your rectangle is: " + rectArea);

        input.close();
    }
}
