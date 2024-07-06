package codingquwstions;

public class MajorityElement {
    public static int majorityElement(int [] nums){
        int canditate = 0;
        int point = 0;
        for (int i = 0; i < nums.length; i++){
            if (point == 0){
                canditate = nums[i];
            }
            if (canditate == nums[i]){
                point++;
            }
            else {
                point--;
            }
        }
        return canditate;
    }

    public static void main(String[] args){
        int [] nums = {1,2,3,4,3,3,};
        int result = majorityElement(nums);
        System.out.println(result);

    }
}
