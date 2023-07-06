// 108. Convert Sorted Array to Binary Search Tree
class Solution {
    public TreeNode solve(int[] nums, int low, int high){
        if(low > high) return null;

        int mid = low + (high - low)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = solve(nums, low, mid-1);
        node.right = solve(nums, mid+1, high);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {

        if(nums.length == 0) return null;

        return solve(nums, 0, nums.length - 1);  
        
    }
}
