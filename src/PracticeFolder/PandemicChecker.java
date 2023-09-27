package PracticeFolder;

import java.util.Scanner;

public class PandemicChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");

        try {
            int year = scanner.nextInt();
            String result = checkPandemic(year);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid year.");
        } finally {
            scanner.close();
        }
    }

    public static String checkPandemic(int year) {
        String result = "No pandemic in " + year;

        if (year >= 1346 && year <= 1353) {
            result = "In " + year + ", there was the Black Death";
        } else if (year >= 1665 && year <= 1666) {
            result = "In " + year + ", there was the Great Plague of London";
        } else if (year >= 1770 && year <= 1772) {
            result = "In " + year + ", there was the Russian plague";
        } else if (year == 1889 || year == 1890) {
            result = "In " + year + ", there was the Flu pandemic";
        } else if (year == 1916) {
            result = "In " + year + ", there was the American polio epidemic";
        } else if (year >= 1918 && year <= 1920) {
            result = "In " + year + ", there was the Spanish Flu";
        } else if (year >= 2009 && year <= 2010) {
            result = "In " + year + ", there was the H1N1 Swine Flu pandemic";
        } else if (year >= 2014 && year <= 2016) {
            result = "In " + year + ", there was the West African Ebola epidemic";
        } else if (year >= 2020 && year <= 2022) {
            result = "In " + year + ", there was COVID-19";
        }

        return result;
    }
}
    //This Java program does the same thing as the Python program but uses Java syntax and constructs. It reads a year from the user, checks if it falls within the specified pandemic date ranges, and then prints the corresponding pandemic name or "No pandemic."


