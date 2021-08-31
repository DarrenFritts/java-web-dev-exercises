package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;

public class CharacterCount {

    public static void main(String[] args) {
        // parse the following text into individual chars and count the number of times each appear in text
        String phrase = "If the product of two terms is zero then common sense says at least one of the two terms " +
                "has to be zero to start with. So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";

        // convert String object into an array of characters
        char[] charactersInString = phrase.toCharArray();

        // create a HashMap to store the key/value pairs of data (each character and its count)
        HashMap<Character, Integer> charCountHashMap = new HashMap<>();

        //System.out.println(phrase);
        //System.out.println(charactersInString);

        // Loop through the string one character at a time,
        for (char character : charactersInString) {
            //System.out.println(character);
            // Store and/or update the count for a given character using an appropriate data structure.
            if (!charCountHashMap.containsKey(character)) {
                charCountHashMap.put(character, 1);
            } else {
                Integer charCount = charCountHashMap.get(character);
                charCount += 1;
                charCountHashMap.put(character, charCount);
            }
        }
        // Loop through the data structure to print the results (one character and its count per line).
        // System.out.println(charCountHashMap);
        // https://stackoverflow.com/questions/5920135/printing-hashmap-in-java
        charCountHashMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
