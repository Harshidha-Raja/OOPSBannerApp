import java.util.HashMap;
import java.util.Map;

public class uc8 {

    // Map to store character patterns
    static Map<Character, String[]> charPatterns = new HashMap<>();

    // Initialize the character patterns
    static {
        charPatterns.put('O', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        });

        charPatterns.put('P', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*****",
                "*    ",
                "*    ",
                "*    "
        });

        charPatterns.put('S', new String[]{
                " *****",
                "*    ",
                "*    ",
                "*****",
                "    *",
                "    *",
                "*****"
        });
    }

    // Function to print a word using the character map
    static void printBanner(String word) {
        word = word.toUpperCase(); // ensure uppercase
        for (int i = 0; i < 7; i++) { // each row of the banner
            StringBuilder line = new StringBuilder();
            for (char ch : word.toCharArray()) {
                String[] pattern = charPatterns.get(ch);
                if (pattern != null) {
                    line.append(pattern[i]).append("   "); // spacing between letters
                }
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        String word = "OOPS";
        printBanner(word);
    }
}
