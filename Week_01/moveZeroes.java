import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,0,3,12};
        moveZeroes1(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes1(int[] nums) {
        if(nums.length < 2){
            return;
        }
        int k = 0;
        //顺序遍历数组
        int count = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }
            count ++;
        }
        System.out.println(count);
    }
}
