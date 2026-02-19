package week05;

import java.util.Arrays;

public class Anagrams {
        public static boolean areAnagrams(String a, String b) {
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x, y);
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("listen", "silent"));
    }
}
