package codingquwstions;

public class RemoveElement {
    public static int removeElement(int[] nums, int val){
        int i =0;
        int j=0;
        while (i < nums.length){
            if (nums[i] != val){
                nums[i] = nums[j];
                j += 1;
            }
            i += 1;
        }
        return j;
    }
    public static void main(String[] args){
        int [] nums ={1,2,2,3,4,0,2};
        int val = 2;
        int result = removeElement(nums,val);
        System.out.println(result);
    }
}
