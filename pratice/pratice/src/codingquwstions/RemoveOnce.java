package codingquwstions;

public class RemoveOnce {
    public static int removeArrayOnce(int [] nums){
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != nums[j]){
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
    public static void main(String[] args){
        int[] nums = {0,0,1,1,2,3,3,4};
        int result = removeArrayOnce(nums);
        System.out.println(result);
    }
}
