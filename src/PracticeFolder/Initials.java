package PracticeFolder;
/*

		Given an array of classmate’s names, first name and last separated by a space, print the initials of everyone
                	Ex: Input:
                		[ “James Bond”, “Eve Rell”, “Anna Johnson” ] Output:

			    Output:
				JB ER AJ
 */
public class Initials {
    public static void main(String[] args) {
        String[] classmates = {"James Bond", "Eve Rell", "Anna Johnson"};
        String[] initials = new String[classmates.length];

        for (int i = 0; i < classmates.length; i++) {
            String[] parts = classmates[i].split(" ");
            initials[i] = parts[0].substring(0, 1) + parts[1].substring(0, 1);
        }

        String result = String.join(" ", initials);
        System.out.println(result);
    }
}





