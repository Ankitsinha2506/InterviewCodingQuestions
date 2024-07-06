package codingquwstions;

public class JumpGame {
    public static boolean jumpGame(int[] nums){
        int finalPosition = nums.length - 1;
        for (int i = nums.length - 2; i >=0; i--){
            if (i + nums[i] >= finalPosition){
                finalPosition = i;
            }
        }
        return finalPosition == 0;
    }
    public static void main(String[] args){
        int[] nums = {1,1,2,4,2,1,0,0,1,3};
        boolean result = jumpGame(nums);
        System.out.println(result);
    }
}
