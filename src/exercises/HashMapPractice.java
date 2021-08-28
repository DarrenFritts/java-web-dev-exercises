package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Key Enter Each Student's Name (or press ENTER to finish):");

        do {
            System.out.println("\nStudent's Name:");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.println("\nStudent's ID:");
                Integer newID = input.nextInt();
                students.put(newID, newStudent);

                input.nextLine();
            }
        } while (!newStudent.equals(""));

        input.close();

        System.out.println("\nClass Roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("[ID # " + student.getKey() + "] " + student.getValue());
        }

        System.out.println("Number of students in roster: " + students.size());
    }
}
