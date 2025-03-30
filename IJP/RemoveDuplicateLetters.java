package IJP;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        String str = "hello hii good morning";
        StringBuilder result = new StringBuilder();

        // Boolean array to track seen characters (assuming ASCII characters)
        boolean[] seen = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen[ch]) {
                result.append(ch);
                seen[ch] = true;
            }
        }

        System.out.println(result.toString());
    }
}

