public class uc7 {

    // Inner class to encapsulate character pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {
        // Create a mapping for characters O, P, S
        CharacterPattern O = new CharacterPattern('O', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*****",
                "*    ",
                "*    ",
                "*    "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                " *****",
                "*    ",
                "*    ",
                "*****",
                "    *",
                "    *",
                "*****"
        });

        // Word to print
        CharacterPattern[] word = {O, O, P, S};

        // Print the banner line by line
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (CharacterPattern ch : word) {
                line.append(ch.getPattern()[i]).append("   "); // spacing between letters
            }
            System.out.println(line);
        }
    }
}
