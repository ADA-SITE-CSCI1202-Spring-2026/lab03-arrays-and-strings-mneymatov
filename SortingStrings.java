package week05;

import java.util.Arrays;

public class SortingStrings {
        public static String sortString(String str) {
        char[] letters = str.toCharArray();  
        Arrays.sort(letters);                
        return new String(letters);         
    }

    public static void main(String[] args) {
        String text = "hello";
        System.out.println(sortString(text));
    }
}
