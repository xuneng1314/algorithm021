import java.util.Arrays;

public class rotate {
    public static void main(String[] args) {
        int[] heigth = new int[]{};
        rotate(heigth,10);
        System.out.println(Arrays.toString(heigth));
    }

    /**
     * 旋转数组，
     * 输入: [1,2,3,4,5,6,7] 和 k = 3
     * 输出: [5,6,7,1,2,3,4]
     * 解释:
     * 向右旋转 1 步: [7,1,2,3,4,5,6]
     * 向右旋转 2 步: [6,7,1,2,3,4,5]
     * 向右旋转 3 步: [5,6,7,1,2,3,4]
     *
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        if(nums.length < 2){
            return;
        }
        k = k % nums.length;
        //首先整个数组旋转
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    public static void reverse(int[] nums,int start,int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
