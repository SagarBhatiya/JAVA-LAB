import java.util.*;

class WordExample { // Removed 'public'
    private String strdata;

    public WordExample(String str) {
        str = str.trim();
        char lastChar = str.charAt(str.length() - 1);
        if (lastChar == '.' || lastChar == '?' || lastChar == '!') {
            str = str.substring(0, str.length() - 1);
        }
        strdata = str;
    }

    public void countWord() {
        String[] words = strdata.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.length() > 0 && isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
                count++;
            }
        }

        System.out.println("Number of words starting and ending with a vowel: " + count);
    }

    public void placeWord() {
        String[] words = strdata.split("\\s+");
        String vowelWords = "";
        String otherWords = "";

        for (String word : words) {
            if (word.length() > 0 && isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
                vowelWords += word + " ";
            } else {
                otherWords += word + " ";
            }
        }

        System.out.println("Rearranged sentence: " + vowelWords + otherWords);
    }

    private boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }
}

public class qs11 { // This is the public class matching the filename
    public static void main(String[] args) {
        WordExample obj = new WordExample("OWL EAGLE IS FLYING HIGH!");
        obj.countWord();
        obj.placeWord();
    }
}
