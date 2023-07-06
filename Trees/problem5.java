// 101. Symmetric Tree
class Solution {
    private boolean isMirror(TreeNode leftSubtree, TreeNode rightSubtree){
        if(leftSubtree == null || rightSubtree == null){
            return leftSubtree == rightSubtree;
        }
        return leftSubtree.val == rightSubtree.val && isMirror(leftSubtree.right, rightSubtree.left) && isMirror(leftSubtree.left, rightSubtree.right);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isMirror(root.left, root.right);
    }
}
