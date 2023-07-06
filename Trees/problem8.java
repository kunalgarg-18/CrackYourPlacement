// 104. Maximum Depth of Binary Tree
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int ans = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            ans++;
            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll();
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
        }
        return ans;        
    }
}
