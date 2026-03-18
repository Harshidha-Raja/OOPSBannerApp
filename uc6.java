public class uc6 {

    static String[] getO() {
        return new String[]{
            "*****",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*****"
        };
    }

    static String[] getP() {
        return new String[]{
            "*****",
            "*   *",
            "*   *",
            "*****",
            "*    ",
            "*    ",
            "*    "
        };
    }

    static String[] getS() {
        return new String[]{
            "*****",
            "*    ",
            "*    ",
            "*****",
            "    *",
            "    *",
            "*****"
        };
    }

    public static void main(String[] args) {

        String[] O1 = getO();
        String[] O2 = getO();
        String[] P = getP();
        String[] S = getS();

        // Print O O P S
        for (int i = 0; i < 7; i++) {
            System.out.println(O1[i] + "   " + O2[i] + "   " + P[i] + "   " + S[i]);
        }
    }
}