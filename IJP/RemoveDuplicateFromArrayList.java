package IJP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(60);
        nums.add(10);
        nums.add(20);
        nums.add(30);

        System.out.println(nums);
        Set<Integer> num = new HashSet<>(nums);
        System.out.println(num);
    }
}
