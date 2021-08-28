package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String [] args) {

        //Scanner input = new Scanner(System.in);

        ArrayList<Integer> numArrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        /*ArrayList<Integer> numArrayList = new ArrayList<>();
        numArrayList.add(1);
        numArrayList.add(2);
        numArrayList.add(3);
        numArrayList.add(4);
        numArrayList.add(5);
        numArrayList.add(6);
        numArrayList.add(7);
        numArrayList.add(8);
        numArrayList.add(9);
        numArrayList.add(10);*/

        ArrayList<String> wordArrayList = new ArrayList<>(Arrays.asList("who", "what", "when", "where", "how", "why"));

        System.out.println(sumEvenNums(numArrayList));
        System.out.println(printWordList(wordArrayList));
    }

    public static int sumEvenNums(ArrayList<Integer> numArrayList) {
        int evenNumTotal = 0;
        for (int evenNum : numArrayList) {
            if (evenNum % 2 == 0) {
                evenNumTotal += evenNum;
            }
        }
        return evenNumTotal;
    }

    public static String printWordList(ArrayList<String> wordArrayList) {
        Scanner input = new Scanner(System.in);
        // BONUS with original pre-bonus code commented out
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String newPhrase = phrase.replace(",", "");
        String newerPhrase = newPhrase.replace(".", "");
        String[] words = newerPhrase.split(" ");

        //ArrayList<String> wordsWithFive = new ArrayList<>();
        ArrayList<String> wordsWithUserLength = new ArrayList<>();
        System.out.println("Enter a number from 3 to 5 :");
        Double wordLength = input.nextDouble();
        /*for (String word : wordArrayList) {
            if (word.length() == wordLength) {
                //wordsWithFive.add(word);
                wordsWithUserLength.add(word);
            }*/
        for (String word : words) {
            if(word.length() == wordLength) {
                wordsWithUserLength.add(word);
            }
        }
        //return wordsWithFive.toString();
        return wordsWithUserLength.toString();
    }
}
