package LeetCode;

import java.util.Arrays;

public class Test26_1 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,2};
        int b = removeDuplicates(a);
        System.out.println("b = " + b);
        System.out.println(Arrays.toString(a));
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length < 2){
            return nums.length;
        }
        int k =0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[k]!=nums[i]){//只要相等，就往后遍历，直到不相等为止，把k+1为止的值换成num[i]的值
                nums[++k] = nums[i];
            }
        }
        return k+1;
    }
}
