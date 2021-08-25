package exercises;
import java.util.Scanner;

public class AliceExtended {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures " +
                "or conversation?'";

        System.out.println("Please enter a search term:");
        String searchTerm = input.nextLine();

        String searchTermCaseInsensitive = searchTerm.toLowerCase();
        String sentenceCaseInsensitive = sentence.toLowerCase();

        String sentenceModified = sentence.replaceFirst(searchTerm, "");

        input.close();
        System.out.println(sentenceCaseInsensitive.contains(searchTermCaseInsensitive));

        Integer searchTermIndex = sentenceCaseInsensitive.indexOf(searchTermCaseInsensitive);
        Integer searchTermLength = searchTermCaseInsensitive.length();
        System.out.println("Your search term is located at index " + searchTermIndex + " and has a length of " + searchTermLength + " characters");

        System.out.println("The sentence with your search term removed is :");
        System.out.println(sentenceModified);
    }
}
