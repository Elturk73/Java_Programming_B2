package PracticeFolder;
public class ShortestAndLongestWords {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "date", "education"};

        String shortestWord = words[0];
        String longestWord = words[0];

        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }

            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Shortest word: " + shortestWord);
        System.out.println("Longest word: " + longestWord);
    }
}