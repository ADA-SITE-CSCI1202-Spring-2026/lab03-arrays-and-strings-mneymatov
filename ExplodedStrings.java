package week05;

public class ExplodedStrings {
        public static String explodeString(String str) {
        StringBuilder exploded = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            exploded.append(str.substring(0, i + 1));
        }

        return exploded.toString();
    }
    public static void main(String[] args) {

        String text = "Baku";

        System.out.println(explodeString(text));
    }
}
