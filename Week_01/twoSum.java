import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int[] nums2 = twoSum(nums,9);
        System.out.println(Arrays.toString(nums2));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if(nums.length < 2){
            return res;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i];
            if(map.get(nums[i]) != null){
                res[0] = map.get(nums[i]);
                res[1] = i;
                return res;
            }else{
                map.put(t,i);
            }
        }
        return res;
    }
}
