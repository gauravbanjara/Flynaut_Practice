package IJP;

import java.util.HashMap;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "aahhaaggtbhau";
//        char [] arr = str.toCharArray();
//        for (int i = 0; i <= arr.length-2 ; i++) {
//            int count = 0;
//            for (int j = i+1; j <= arr.length-1 ; j++) {
//                if (arr[i] == arr[j]){
//                    count++;
//                }
//            }
//            if(count==0)
//            {
//                System.out.println(arr[i]);
//                break;
//            }
//        }


        //  using Hashmap
        HashMap<Character, Integer> count = new HashMap<>();

        // Count the occurrences of each character
        for (char ch : str.toCharArray()) {
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }
        // Find the first character with a count of 1
        for (char ch : str.toCharArray()) {
            if (count.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }

    }
}
