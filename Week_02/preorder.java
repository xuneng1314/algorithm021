package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test589 {
    List<Integer> list = new ArrayList<Integer>();

    public List<Integer> preorder2(Node root) {
        if(root == null){
            return list;
        }
        //迭代的办法，手动维护栈
        Stack<Node> stack = new Stack();
        stack.push(root);//先把根节点压入栈
        while(!stack.isEmpty()){
            //以此让孩子节点从后往前压入栈，为啥从后往前，是因为出栈的时候是逆序，
            Node node = stack.pop();
            list.add(node.val);
            for (int i = node.children.size()-1; i >=0 ; i--) {
                stack.push(node.children.get(i));
            }
        }
        return list;
    }

    public List<Integer> preorder(Node root) {
        printNode(root);
        return list;
    }
    public void printNode(Node root){
        if(root == null){
            return;
        }
        list.add(root.val);
        for(Node n:root.children){
            printNode(n);
        }
    }
}
