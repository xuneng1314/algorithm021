public class maxArea {
    public static void main(String[] args) {
        int[] heigth = new int[]{1,8,6,2,5,4,8,3,7};
        int a = maxArea(heigth);
    }

    /**
     * 求最大面积
     * @param height
     * @return 返回最大面积
     */
    public static int maxArea(int[] height) {
        if(height.length < 2){
            return 0;
        }
        int m = 0;
        int start = 0;
        int end = height.length - 1;
        while (start < end){
            m = Math.max(m,(end - start)*Math.min(height[start],height[end]));
            if(height[start] > height[end]){
                end--;
            }else{
                start++;
            }
        }
        return m;
    }
}
