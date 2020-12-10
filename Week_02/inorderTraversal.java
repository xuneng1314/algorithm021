package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Test94 {
    List<Integer> list = new ArrayList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root) {
        printMidTree(root);
        return list;
    }

    public void printMidTree(TreeNode root){
        if(root == null){
            return;
        }
        printMidTree(root.left);
        list.add(root.val);
        printMidTree(root.right);
    }

}
