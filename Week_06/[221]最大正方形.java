//在一个由 '0' 和 '1' 组成的二维矩阵内，找到只包含 '1' 的最大正方形，并返回其面积。 
//
// 
//
// 示例 1： 
//
// 
//输入：matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"]
//,["1","0","0","1","0"]]
//输出：4
// 
//
// 示例 2： 
//
// 
//输入：matrix = [["0","1"],["1","0"]]
//输出：1
// 
//
// 示例 3： 
//
// 
//输入：matrix = [["0"]]
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// m == matrix.length 
// n == matrix[i].length 
// 1 <= m, n <= 300 
// matrix[i][j] 为 '0' 或 '1' 
// 
// Related Topics 动态规划 
// 👍 642 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length <1 || matrix[0].length<1) return 0;
        int heigth = matrix.length;
        int width = matrix[0].length;
        int maxSide = 0;
        int[][] dp = new int[heigth+1][width+1];
        for (int row = 0; row < heigth; row++) {
            for (int col = 0; col < width; col++) {
                if(matrix[row][col]=='1'){
                    dp[row+1][col+1] = Math.min(Math.min(dp[row+1][col],dp[row][col+1]),dp[row][col]) + 1;
                    maxSide = Math.max(maxSide,dp[row+1][col+1]);
                }
            }
        }
        return maxSide * maxSide;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
