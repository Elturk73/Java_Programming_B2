package day04_Variables;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        byte age = 50;
        System.out.println(age);
        System.out.println("age");
        age = 70;
        byte age2 = 95;

        short year;
        year = 2023;

        int addressNumber = 234567;
        long bigNumber = 127563546533333L;

        System.out.println(addressNumber);
        System.out.println(bigNumber);
        System.out.println(year);

        byte age1 = 90; // I declared a variable called age which has int data type and number 50 is assigned to it.
        System.out.println("50");  // Hardcoded -- mean you have to change it manually
        System.out.println("age"); // here "age" is not a variable. It is just a word that we are printing
        System.out.println(age1);
        age = 90;
        System.out.println(age);

        //byte age = 95;   // In Java, we canNOT declare SAME variable name more than ONCE
        age = 100; // Since we are NOT DECLARATION it again, we can use the same variable name. It will REASSIGN the value.

        //long year;  //Even if you have a DIFFERENT Data type, you can not use the SAME variable name more than ONCE in the same BLOCK OF CODE



    }
}
