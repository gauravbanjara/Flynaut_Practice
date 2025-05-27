package StringQ;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "jadhav gaurav";
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length-1; i++) {
            int count = 0;
            for (int j = i+1; j < ch.length; j++) {
                if (ch[i] == ch[j])
                    count++;
            }
            if (count == 0)
                System.out.println(ch[i]);
            break;
        }
    }
}
