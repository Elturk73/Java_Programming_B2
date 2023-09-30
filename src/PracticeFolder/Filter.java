package PracticeFolder;

import java.util.Scanner;

public class Filter {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = scanner.nextLine().trim();

        if (message.equals("java is bad") || message.equals("quit") || message.equals("have fun") || message.equals("crying")) {
            System.out.println("Message failed to send");
        } else {
            System.out.println(message + " sent");
        }
    }
}