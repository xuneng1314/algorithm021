package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test102_1 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.push(root);//头结点先入队
        while(queue.size() > 0){
            int size = queue.size();//先缓存队列个数，就是本层元素的个数
            List<Integer> list2 = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode popNode = queue.remove();//本层所有元素挨个出队。
                list2.add(popNode.val);
                //把本层的左右节点分别入队
                if(popNode.left != null){
                    queue.add(popNode.left);
                }
                if(popNode.right != null){
                    queue.add(popNode.right);
                }
            }
            list.add(list2);
        }
        return list;
    }
}
