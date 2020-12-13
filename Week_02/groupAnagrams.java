package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Test49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if(strs.length == 0){
            return res;
        }
        HashMap<String,List> map = new HashMap<>();
        for (String s:strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);//把数组排序，这样拿到同样的数据当做key
            String key = String.valueOf(arr);
            if(!map.containsKey(key)){//如果不存在就放进去
                map.put(key,new ArrayList());
            }
            map.get(key).add(s);//通过拿到相同的key，把结果加进去。

        }
        return new ArrayList(map.values());
    }
}
