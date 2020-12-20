package LeetCode;

public class Test236 {

    /**
     *  二叉树的最近公共祖先
     *  判断二叉树公共祖先条件
     *  1、如果root是null，直接返回null
     *  2、如果root等于p或者等于q。直接返回p或者q
     *  3、因为是递归，我们获取左节点和右节点递归结果，如果返回的结果左节点为空，说明p和q都没有再左节点下面，
     *  那就返回右节点，同理右节点为空就返回左节点，
     *  4、当左右节点都不为空，说明p和q一个在root左边，一个在root右边，就直接返回root即可
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left !=null && right !=null) return root;
        if(left != null) return left;
        if(right != null) return right;
        return null;
    }
}
