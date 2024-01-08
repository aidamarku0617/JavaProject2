package SecondProjectCoding;

public class ReverseString {
    public static void main(String[] args) {


        //Reverse a String: Write a function to reverse a given string.
        // For example, given the input "Hello", the output should be "olleH".

        String str = "Hello";
        String reversed=reverseString("Hello");
        System.out.println(reversed);
    }

    public static String reverseString(String str) {


        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {

            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
