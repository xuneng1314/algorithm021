package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class Test1_1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i =0;i< nums.length;i++){
            int m = target - nums[i];
            Integer index = map.get(nums[i]);
            if(index == null){
                //如果差值没有在map中，就没找到结果，放到map中
                map.put(m,i);
            }else{//如果存在说明找到了，返回找到的结果
                arr[0]=map.get(nums[i]);
                arr[1]=i;
                return arr;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 11, 15};

        System.out.printf(Arrays.toString(twoSum(arr,9)));
    }
}
