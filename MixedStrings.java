package week05;

public class MixedStrings {
        public static String mixSentence(String s) {
        String[] words = s.split(" ");
        String result = "";

        for (String w : words) {
            if (w.length() > 1)
                w = w.charAt(w.length()-1) +
                    w.substring(1, w.length()-1) +
                    w.charAt(0);

            result += w + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(mixSentence("This is PP2 Fall 2021"));
    }
}
