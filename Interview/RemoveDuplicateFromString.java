package Interview;

public class RemoveDuplicateFromString {
    public static void main(String[] args) {
        String str = "chatrapati shivaji maharaj";
        StringBuilder result = new StringBuilder();
        boolean [] arr = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!arr[ch]){
                result.append(ch);
                arr[ch] = true;
            }
        }
        System.out.println(result);
    }
}
