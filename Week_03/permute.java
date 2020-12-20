package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Test46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int[] visited = new int[nums.length];//已经访问过的
        back(nums,new ArrayList<Integer>(),res,visited);
        return res;
    }

    private void back(int[] nums, ArrayList<Integer> objects, List<List<Integer>> res, int[] visited) {
        if(objects.size() == nums.length){
            res.add(new ArrayList<Integer>(objects));
            return;//已经找到了一种全排列，添加到结果里面去，返回
        }
        for (int i = 0; i < nums.length; i++) {
            if(visited[i]==1)continue;//已经访问过了
            visited[i]=1;
            objects.add(nums[i]);
            back(nums,objects,res,visited);
            visited[i]=1;
            objects.remove(objects.size()-1);
        }
    }
}
