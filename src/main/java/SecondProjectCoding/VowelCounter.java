package SecondProjectCoding;

public class VowelCounter {
    public static void main(String[] args) {
        //Create a method to count how many vowels are
        // present in a string “documentation”

        String str="documentation";

        int count=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }

        }
        System.out.println("The number of vowels in the string "+str+ " is "+count);
    }

    }

