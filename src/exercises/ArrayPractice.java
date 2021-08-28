package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String [] args) {
        integerExercise();
        stringExercise();
    }

    public static void integerExercise() {
        int myIntArray[] = {1, 1, 2, 3, 5, 8};
        for (int myInt : myIntArray) {
            if (myInt % 2 != 0) {
                System.out.println(myInt);
            }
        }
    }

    public static void stringExercise() {
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        System.out.println(phrase);
        /* String[] words = phrase.split(" "); */
        String[] words = phrase.split("\\.");
        System.out.println(Arrays.toString(words));
        /*System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);*/

    }

}
