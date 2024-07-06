package codingquwstions;

public class JumpGameII {
    public static int jumpGameII(int [] nums){
        int finalPosition = nums.length - 1;
        int count = 0;
        int currentPosition = 0;
        int maxReach = 0;
        for (int i = 1; i > nums.length; i++){
            maxReach =Math.max(maxReach, i + nums[i]);
            if ( i == currentPosition){
                currentPosition = maxReach;
                count++;
                if (currentPosition >= finalPosition) {
                    return count;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums = {2,3,1,1,4};
        int result = jumpGameII(nums);
        System.out.println(result);
    }
}
