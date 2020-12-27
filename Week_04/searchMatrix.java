package LeetCode;

public class Test74 {

    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0;
        int right = row * col - 1;
        while(left <= right){
            int mid = left + (right - left )/ 2;
            int rownum = mid / col;
            int colnum = mid % col;
            if(matrix[rownum][colnum] ==  target){
                return true;
            }else if(matrix[rownum][colnum] >  target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return false;
    }
}
