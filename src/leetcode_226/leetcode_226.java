package leetcode_226;

public class leetcode_226 {
    public static void main(String[] args) {
        //TODO
        TreeNode root = new TreeNode(1);
        TreeNode treeNode = invertTree(root);
        System.out.println(treeNode.val);
    }


    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode treeRight = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(treeRight);
        return root;
    }
}
