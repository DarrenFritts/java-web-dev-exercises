package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        Double numMiles = input.nextDouble();

        System.out.println("How many gallons of gas did you use?");
        Double numGallons = input.nextDouble();

        Double mpg = numMiles / numGallons;
        System.out.println("You are getting " + mpg + "MPG.");

        input.close();
    }
}
