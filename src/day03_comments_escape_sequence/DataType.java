package day03_comments_escape_sequence;

public class DataType {
    public static void main(String[] args) {

        int age = 3;
        System.out.println(age);

        String sentence = "I like Java programming";
        System.out.println(sentence);

        int number = 4;
        char number2 = '4';

        System.out.println(number );// ASCII table value for 4.
        System.out.println(number2);
        System.out.println(number2+number);
        char letter = 'K';

        System.out.println(letter);

        int quantity = 3;
        quantity = 5;

        System.out.println(quantity);
        byte num1;  // Here we declared -- make a container
        num1 = 6;  // Here we assigned a value to ALREADY DECLARED variable.
        System.out.println(num1); // 6

        num1 = 10; // Here we re-assigned a value to ALREADY DECLARED variable
        System.out.println(num1); // 10

        byte num2 = 3; //Here we declared and assigned a value
        System.out.println(num2);
    }

}
