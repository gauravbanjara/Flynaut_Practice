package IJP;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "gaurav";
        char [] arr = str.toCharArray();
        for (int i = 0; i <= arr.length-2 ; i++) {
            int count = 0;
            for (int j = i+1; j <= arr.length-1 ; j++) {
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if(count==0)
            {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
