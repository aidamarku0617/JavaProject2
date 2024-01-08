package SecondProjectCoding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);

        List<Integer> uniqueNumbers=removeDuplicates(numbers);
        System.out.println("List with the duplicates removed "+uniqueNumbers);
    }
    public static List<Integer>removeDuplicates(List<Integer>numbers){
        HashSet<Integer>uniqueSet=new HashSet<>(numbers);

        List<Integer>uniqueNumbers=new ArrayList<>(uniqueSet);
        return uniqueNumbers;
    }
}
