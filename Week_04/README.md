第四周学习总结
本周内容比较多
图深度优先搜索，类似二叉树的现需遍历，用到了回溯思想，即一条路走到底，访问过的节点设置标记。当当前节点相邻节点去不访问过，回溯到上一个节点，继续遍历
图的广度优先搜索，一般使用场景是查找迷宫的最短路径，是通过当前节点一层一层往外遍历，一般使用队列来实现该遍历，例如二叉树的层序遍历。
岛屿数量问题，使用深度优先搜索，有两大要素，1、访问相邻的节点，2、判断终止条件
访问相邻节点，类似网格问题都可以类似处理方式，即访问上下左右4个节点，终止条件，即一定要在网格内，通过这个逻辑就可以得到dfs模板

void dfs(int[][] grid, int r, int c) {
    // 如果坐标 (r, c) 超出了网格范围，直接返回
    if (!inArea(grid, r, c)) {
        return;
    }
    // 访问上、下、左、右四个相邻结点
    dfs(grid, r - 1, c);
    dfs(grid, r + 1, c);
    dfs(grid, r, c - 1);
    dfs(grid, r, c + 1);
}

// 判断坐标 (r, c) 是否在网格中
boolean inArea(int[][] grid, int r, int c) {
    return 0 <= r && r < grid.length 
        	&& 0 <= c && c < grid[0].length;
}

贪心算法：贪心算法可以解出的问题都可以使用动态规划，不过贪心算法因为值考虑最优情况，所以减掉了很多没有 必要的判断，一般都是线性的时间复杂度，是比较高效的，不过贪心算法不一定是最优解，所以只有在能证明贪心算法是最优解的情况下才能使用贪心算法，否则需要使用动态规划。

使用二分查找，寻找一个半有序数组 [4, 5, 6, 7, 0, 1, 2] 中间无序的地方

public static int find(int[] nums){
    if(nums.length <= 2) return nums.length;
    int start = 0;
    int end = nums.length-1;
    //需要找到一个位置，该位置前面比它大，该位置后面比它小
    while(start < end){
        //mid如果为0，并且mid位置的值比mid+1位置的值要大，说明mid+1就是旋转点
        if(start == 0 && nums[start] > nums[start + 1]){
            return start;
        }
        //如果mid问nums.length-1 并且mid位置的值比mid-1位置的值要小，说明mid就是旋转点
        if(start == nums.length-1 && nums[start] < nums[start - 1]){
            return start;
        }
        // nums[mid] > nums[mid - 1] && nums[mid] < nums[mid + 1]说明找到了
        //mid要在[1,nums.length-2]之间
        if(start >= 1 && start <= nums.length-2 && nums[start] < nums[start - 1]){
            return start;
        }
        int mid = start + (end - start + 1)/2;
        //前半部分有序，去后半部分找
        if(nums[start] < nums[mid]){
            start = mid + 1;
        }
        //后半部分有序，去前半部分找
        else{
            end = mid;
        }
    }
    return start;
}




