package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Test144 {
    List<Integer> list = new ArrayList<Integer>();

    public List<Integer> preorderTraversal(TreeNode root) {
        printMidTree(root);
        return list;
    }

    public void printMidTree(TreeNode root){
        if(root == null){
            return;
        }
        list.add(root.val);
        printMidTree(root.left);
        printMidTree(root.right);
    }
}
