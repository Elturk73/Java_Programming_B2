package day03_comments_escape_sequence;

public class TabAndNextLine {
    public static void main(String[] args) {

        // folowing are about the \t - tab

        System.out.println("This is not tabbed");
        System.out.println("\tThis is tabbed 1 time");// tabbed once
        System.out.println("    This is not tabbed");// 4 space is equal to 1 tab

        System.out.println("\\\\abc");
        System.out.println("\t\tThis is tabbed 2 time");// tabbed once

        // followings are about \n - line
        System.out.println("1) Go to the store");
        System.out.println("");// will leave a line empty
        System.out.println("2) Grab milk");
        System.out.println("3) b uy bread");

        System.out.println("\n1) Go to the store\n2) Grab milk\n3) buy bread");
    }
}
