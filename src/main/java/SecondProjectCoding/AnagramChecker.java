package SecondProjectCoding;

import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        //Check if Two Strings are Anagrams: Given two strings,
        // determine if they are anagrams, meaning they contain the same characters
        // in a different order.
        // For example, "listen" and "silent" are anagrams.

        String str1="listen";
        String str2="silent";
        //check ig length are same
        if(str1.length()==str2.length()){

            //convert strings to char array
            char[] charArray1=str1.toCharArray();
            char[] charArray2=str2.toCharArray();

            //sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result =Arrays.equals(charArray1,charArray2);
            if (result){
                System.out.println(str1+" and "+str2+" are anagram");
            }
            else{
                System.out.println(str1+" and "+str2+" are not anagram");
            }
        }
    }
}
