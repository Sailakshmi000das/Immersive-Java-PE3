import java.util.Scanner;
public class Vowels {

    public String[] removingVowels(String s[]) {

        for (int i = 0; i < s.length; i++) {
            s[i] = s[i].replaceAll("[aeiou]", "");
        }
        return s;
    }

    public String removingVowels(String s) {
        s = s.replaceAll("[aeiou]", "");

        return s;
    }

    public String removeNullValues(String s) {

        if (s == null) {
            s = null;
        }
        return "Input String cannot be null";
    }

    public String removeNumericValues(String s) {
        boolean s1;
        if (s.contains("[0-9]+")) {
            s1 = true;
        }
        return "Input String should contain only characters";

    }

}
