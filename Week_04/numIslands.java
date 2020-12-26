public class Test200_1 {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]=='1'){//如果还没遍历过
                    count++;
                    dfs(grid,i,j);//遍历的过程中递归把同一个岛屿的、已经遍历过的设置为2
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid,int r,int c){
        if(!InArea(grid,r,c)) return;//如果已经超出位置，就不去遍历了
        if(grid[r][c]!='1') return;
        grid[r][c] = '2';//设置为2是为了设置已经遍历过的状态
        dfs(grid,r-1,c);//遍历上下左右四个方向
        dfs(grid,r+1,c);
        dfs(grid,r,c+1);
        dfs(grid,r,c-1);
    }

    public boolean InArea(char[][] grid,int r,int c){
        return 0 <= r && r < grid.length && 0 <= c && c < grid[0].length;
    }

}
