package leetcode_617;

public class leetcode_617 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left1 = new TreeNode(3);
        TreeNode left2 = new TreeNode(5);
        TreeNode right1 = new TreeNode(2);
        root.left = left1;
        root.left.left = left2;
        TreeNode root1 = new TreeNode(2);
        TreeNode left11 = new TreeNode(1);
        TreeNode right11 = new TreeNode(3);
        TreeNode right12 = new TreeNode(4);
        TreeNode right22 = new TreeNode(7);
        root1.left = left11;
        root1.left.right = right12;
        root1.right = right11;
        root1.right.right = right22;

        //TODO
        TreeNode treeNode = mergeTrees(root, root1);
        System.out.println(treeNode.val);
    }



    private static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t1;
        }
        if (t2 == null) {
            return t2;
        }
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}
