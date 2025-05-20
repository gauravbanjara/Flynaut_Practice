package IJP;

import java.util.HashMap;

public class FirstNonRepeatingChar {
    private static void firstNonRepeatingCharWithoutCF(String str) {
        char [] arr = str.toCharArray();
        for (int i = 0; i <= arr.length-2 ; i++) {
            int count = 0;
            for (int j = i+1; j <= arr.length-1 ; j++) {
                if (arr[i] == arr[j]){
                        count++;
                }
            }
            if(count==0){
                System.out.println(arr[i]);
                break;
            }
        }
    }

//    private static void firstNonRepeatingCharWithCF(String str) {
//        HashMap<Character, Integer> count = new HashMap<>();
//        for (char ch : str.toCharArray()) {
//            count.put(ch, count.getOrDefault(ch, 0) + 1);
//        }
//        for (char ch : str.toCharArray()) {
//            if (count.get(ch) == 1) {
//                System.out.println(ch);
//                break;
//            }
//        }
//    }
    public static void main(String[] args) {
        String str = "gauravbanjaragreatforu";
        firstNonRepeatingCharWithoutCF(str);
//        firstNonRepeatingCharWithCF(str);
    }
}
