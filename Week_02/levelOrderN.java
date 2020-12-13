package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test429_1 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        LinkedList<Node> queue = new LinkedList<>();
        queue.push(root);//头结点先入队
        while(queue.size() > 0){
            int size = queue.size();//先缓存队列个数，就是本层元素的个数
            List<Integer> list2 = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node popNode = queue.remove();//本层所有元素挨个出队。
                list2.add(popNode.val);
                queue.addAll(popNode.children);
            }
            list.add(list2);
        }
        return list;
    }
}
