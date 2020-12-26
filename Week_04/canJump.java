public class Test55 {
    public static void main(String[] args) {
        canJump(new int[]{3,2,1,0,4});
    }
    public static boolean canJump(int[] nums) {
        int max = 0;//最远能跳的距离
        for (int i = 0; i < nums.length; i++) {
            if(max >= i && nums[i]+i >max){//max >= i这个判断要确保我能达到的最大位置要比当前位置大，如果到不了说明这边就不用遍历了，因为前面都到不了我这个位置
                max = nums[i]+i;
            }
        }
        return max >= nums.length-1;
    }
}
