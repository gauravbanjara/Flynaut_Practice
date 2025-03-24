package IJP;

public class RevserseString {
    public static void main(String[] args) {
        String str = "India";
        char [] ch = str.toCharArray();
        int start = 0;
        int end = ch.length-1;
        while (start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;
        }
        String s = new String(ch);
        System.out.println(s);
    }
}
