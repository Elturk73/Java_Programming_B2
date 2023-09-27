package PracticeFolder;


    public class TheaterSeating {
        public static void main(String[] args) {

            String james = "James";
            String betty = "Betty";
            String herb = "Herb";
            String bob = "Bob";
            String jill = "Jill";

            String[] seating = new String[5];

            seating[0] = james;

            seating[4] = bob;

            if (seating[3] == null) {
                seating[3] = betty;
                seating[2] = herb;
            } else {
                seating[1] = betty;
                seating[0] = herb;
            }

            if (seating[1] == null) {
                seating[1] = jill;
            } else if (seating[3] == null) {
                seating[3] = jill;
            } else {
                System.out.println("Invalid seating arrangement");
                return;
            }

            for (int i = 0; i < seating.length; i++) {
                System.out.print(seating[i]);
                if (i < seating.length - 1) {
                    System.out.print(", ");
                }
            }

            if (!seating[4].equals(bob)) {
                System.out.println("\nThe seating arrangement is invalid because Bob is not sitting on the left aisle.");
            }
        }
    }
