package PracticeFolder;

import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args) {

        float f1 = 14 > 5 ? 12456 : 12456.02f;
        float f2 = f1 + 1024;
        System.out.println(f2);

        System.out.println("-------------------------------------");

        int z = 11;
        switch (z) {
            case 10:
                System.out.println("Monday");
                break;
            case 11:
                System.out.println("Tuesday");
                break;
            case 12:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Friday");
        }

        System.out.println("-------------------------------------");

        // Read the word from the user (in your case, you mentioned that you don't need to do anything with the Scanner)

        // Display the word of the day using the input variable
        String word = "Java";
        System.out.println("Today's word of the day is: " + word);

        // Close the scanner (optional, but recommended to free resources)

        // Assume the String variable word has a predefined value
        // You can change this value

        // Display the word of the day using the input variable
        System.out.println("Today's word of the day is: " + word);
    }
}

