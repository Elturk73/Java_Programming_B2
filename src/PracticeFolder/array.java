public class array {
    public static void main(String[] args) {
        // Create an integer array with a length of 100
        int[] numbers = new int[100];

        // Assign values 1 to 100 to each index of the array
        for (int i = 0; i < 100; i++) {
            numbers[i] = i + 1;
        }

        // Use a for-each loop to print out all the elements of the array
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}