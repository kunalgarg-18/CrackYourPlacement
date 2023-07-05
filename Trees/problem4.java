// Problem 4 : Range Sum of BST
class Solution {
    private void solve(TreeNode root, int low, int high, int[] ans){
        if(root == null) return;
        if(root.val >= low && root.val <= high) ans[0] += root.val;
        solve(root.left, low, high, ans);
        solve(root.right, low, high, ans);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        int[] ans = new int[1];
        solve(root, low, high, ans);
        return ans[0];
    }
}
