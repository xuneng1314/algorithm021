import java.util.Arrays;

public class Test455_1 {
    public static void main(String[] args) {

        findContentChildren(new int[]{1,2,3},new int[]{1,1});
    }
    public static int findContentChildren(int[] g, int[] s) {
        if(s.length == 0) return 0;//没有饼干，直接返回
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);//从小到大排序饼干和小孩胃口
        //去遍历小孩，以从小到大满足小孩胃口为目的
        int index = 0;//饼干遍历到的位置
        for (int i = 0; i < g.length; i++) {
            while(index < s.length && s[index]< g[i]){
                index++;
            }
            if (index >= s.length) break;
            index++;
            count++;
        }

        return count;
    }
}
