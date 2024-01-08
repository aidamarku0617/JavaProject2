package SecondProjectCoding;

public class AlphaCharacters {
    public static void main(String[] args) {
        //Find out how many alpha characters are present in a string?



        String str="Hello Java";
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if (Character.isLetter(c)){
                count++;
            }
        }
        System.out.println("the number of alphabetic in the string is: "+count);
    }
}
