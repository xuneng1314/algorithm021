package LeetCode;

import java.util.Arrays;

public class Test88 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        merge(nums1,0,nums2,1);
        System.out.println(Arrays.toString(nums1));
    }

    /**
     * 合并两个排序的数组
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     * 思路：从后往前遍历数组，使用两个指针分别指向两个数组的末尾元素，分别比较大小，如果大的放入到末尾
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m + n - 1;
        int p1 = m - 1;
        int p2 = n - 1;
        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1]>nums2[p2]){
                int temp = nums1[p1];
                nums1[p1] = nums1[p];
                nums1[p] = temp;
                p--;
                p1--;
            }else{
                nums1[p] = nums2[p2];
                p--;
                p2--;
            }
        }
        if(p2 >= 0){
            for (int i = 0; i <= p2; i++) {
                nums1[i] = nums2[i];
            }
        }

    }
}
