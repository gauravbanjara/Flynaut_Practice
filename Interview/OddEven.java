package Interview;

import java.util.ArrayList;

public class OddEven {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(52);
        numbers.add(21);
        numbers.add(63);
        numbers.add(19);
        numbers.add(60);
        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for (Integer nums : numbers){
            if (nums % 2 == 0){
                even.add(nums);
            }else {
                odds.add(nums);
            }
        }
        System.out.println("Even element : "+even);
        System.out.println("Odd element : "+odds);
    }
}
