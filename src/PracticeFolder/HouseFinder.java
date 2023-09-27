package PracticeFolder;

import java.util.Scanner;

public class HouseFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your budget: ");
        int budget = scanner.nextInt();

        if (budget < 0) {
            System.out.println("That is not a valid budget");
        } else if (budget > 300000) {
            System.out.println("Too much money for this agency");
        } else {
            findHouse(budget);
        }

        scanner.close();
    }

    public static void findHouse(int budget) {
        String neighborhood = "";
        int minPrice = 0;
        int maxPrice = 0;
        double rating = 0.0;
        String gated = "";
        String allowPets = "";

        if (budget >= 80000 && budget <= 100000) {
            neighborhood = "Hills";
            minPrice = 80000;
            maxPrice = 100000;
            rating = 4.0;
            gated = "No";
            allowPets = "Yes";
        } else if (budget >= 55000 && budget <= 75000) {
            neighborhood = "Oaks";
            minPrice = 55000;
            maxPrice = 75000;
            rating = 3.5;
            gated = "No";
            allowPets = "Yes";
        } else if (budget >= 120000 && budget <= 150000) {
            neighborhood = "Highland";
            minPrice = 120000;
            maxPrice = 150000;
            rating = 4.5;
            gated = "Yes";
            allowPets = "No";
        } else if (budget >= 160000 && budget <= 201000) {
            neighborhood = "Canyon";
            minPrice = 160000;
            maxPrice = 201000;
            rating = 4.8;
            gated = "Yes";
            allowPets = "Yes";
        } else {
            System.out.println("No available houses");
            return;
        }

        System.out.println("Neighborhood: " + neighborhood);
        System.out.println("Price Range: $" + minPrice + " - $" + maxPrice);
        System.out.println("Rating: " + rating);
        System.out.println("Gated Community: " + gated);
        System.out.println("Allow Pets: " + allowPets);
    }
}