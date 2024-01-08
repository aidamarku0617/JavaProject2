package SecondProjectCoding;

import java.util.List;
//You have a list of strings and you want
// to keep only those that start with “A” and you want
// to return them in lower case".
public class ArrayList {
    public static void main(String[] args) {
        List<String> strings=new java.util.ArrayList<>();
        strings.add("Apple");
        strings.add("Avocado");
        strings.add("Banana");
        strings.add("Orange");

        List<String> filteredStrings=filterAndConvertToLower(strings);
        System.out.println(filteredStrings);
    }
    public static List<String>filterAndConvertToLower(List<String>strings){
        List<String>filteredStrings=new java.util.ArrayList<>();
        for (String str:strings){
            if(str.startsWith("A")){
                filteredStrings.add((str.toLowerCase()));

            }
        }
        return filteredStrings;
    }
}
