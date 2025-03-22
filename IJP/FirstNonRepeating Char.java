package IJP;

class FirstNonRepeatingChar
{
    public static void main(String...args){
        String s="chandrapalch";
        // String s="gurabvgapoyurav";
        char[] arr =s.toCharArray();
        int l=arr.length;
        for(int i=0;i<=l-2;i++)
        {
            int count=0;
            for(int j=i+1;j<=l-1;j++)
            {
                if(arr[i] == arr[j])
                    count++;
            }
            if(count==0)
            {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
