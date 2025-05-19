public class StringModifier {
    public static void modifyStrings(String S, String S1, String S2) {
        // Replace all occurrences of S1 with S2 in S
        String modified = S.replaceAll(S1, S2);
        // Print the modified string
        System.out.println(modified);
    }

    public static void main(String[] args) {
        String S = "abababa";
        String S1 = "aba";
        String S2 = "a";
        modifyStrings(S, S1, S2);
    }
}