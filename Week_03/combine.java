package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Test77 {
    List<Integer> list = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        dfs(1,n,k);
        return ans;
    }

    private void dfs(int i, int n, int k) {
        //list长度加上i-n之间的长度都不满足k个数，说明肯定组合不了k个元素组合了
        if(list.size() + (n - i + 1) < k){
            return;
        }
        if(list.size() == k){
            ans.add(new ArrayList<Integer>(list));
            return;
        }
        list.add(i);//选择当前位置
        dfs(i+1,n,k);//递归选择下一个位置
        list.remove(list.size()-1);//回溯到添加之前
        dfs(i + 1,n,k);//不选择当前位置
    }

}
