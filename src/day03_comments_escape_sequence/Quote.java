package day03_comments_escape_sequence;

public class Quote {
    public static void main(String[] args) {
   /*
   Q: How can I output this?
   I like "Java" Programming
   */
        System.out.println("I like Java Programming. ");
        System.out.println("I like \"Java\" Programming. "); //to use the "" need to add a backwardslash.
        System.out.println("I like 'Java' Programming. ");
        System.out.println("I like \\Java\\ Programming. "); // needs another backwardslash to use backwardslash.
        System.out.println("\\\\I like Java Programming. \\\\");


    }
}
