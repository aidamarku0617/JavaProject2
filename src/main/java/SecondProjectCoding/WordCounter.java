package SecondProjectCoding;

public class WordCounter {
    //Count the Number of Words in a String: Write a function to count
    // the number of words in a given string. Words are separated
    // by spaces or punctuation. For example, the input "Hello, world!" should return 2.

    public static void main(String[] args) {
        String input = "Hello, World!";

        String[] word = input.split(" ");

        int wordCount = word.length;
        System.out.println("Number of words: " + wordCount);
    }
}