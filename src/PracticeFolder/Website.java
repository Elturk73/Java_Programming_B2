package PracticeFolder;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a website: ");
        String website = scanner.nextLine();

        boolean isValid = website.startsWith("www.") && (website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov") || website.endsWith(".net"));

        if (isValid) {
            System.out.println("Valid website.");
        } else {
            System.out.println("Invalid website.");
            System.out.println("Websites should end with; .com, .edu, .gov, and .net");
        }
    }

}