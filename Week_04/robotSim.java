import java.util.HashSet;
import java.util.Set;

public class Test874 {

    public static void main(String[] args) {
        robotSim(new int[]{4,-1,4,-2,4},new int[][]{{2,4}});
    }

    public static int robotSim(int[] commands, int[][] obstacles) {
        Set<String> set = new HashSet();//障碍物
        for (int[] a:obstacles) {
            set.add(a[0]+","+a[1]);
        }
        int x = 0;
        int y = 0;
        int dir = 0;
        //北 0 东 1 南 2 西 3
        int[][] dd = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        int max = 0;
        for (int c:commands) {
            if(c == -2){
                dir = dir - 1 >= 0 ? dir - 1:3;
            }else if(c == -1){
                dir = dir + 1 > 3 ? 0:dir + 1;
            }else{
                for (int i = 0; i < c; i++) {
                    int[] temp = dd[dir];
                    int addx = x + temp[1];
                    int addy = y + temp[0];
                    if(set.contains(addx+","+addy)){//障碍物到了，直接退出当前循环
                        break;
                    }
                    x = addx;
                    y = addy;
                    max = Math.max(max,x * x + y * y);
                }
            }
        }
        return max;
    }
}
