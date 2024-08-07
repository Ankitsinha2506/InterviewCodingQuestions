package codingquwstions;

import java.util.ArrayList;
import java.util.List;

public class DuplicateArray2 {
    public static int Duplicatearray(List<Integer> nums) {
        if (nums == null || nums.size() == 0) {
            return 0;
        }

        int count = 1;
        int index = 1;

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i).equals(nums.get(i - 1))) {
                if (count < 2) {
                    nums.set(index++, nums.get(i));
                }
                count++;
            } else {
                count = 1;
                nums.set(index++, nums.get(i));
            }

        }
        return index;
    }
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(4);
        int res = Duplicatearray(nums);
        System.out.println(nums);
    }
}
