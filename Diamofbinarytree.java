/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftheight = findheight(root.left);
        int rightheight = findheight(root.right);
        int passthroughroot= leftheight+rightheight;
        int l = diameterOfBinaryTree(root.left);
        int r = diameterOfBinaryTree(root.right);
        int notpassthroughroot = Math.max(l,r);
        return Math.max(passthroughroot,notpassthroughroot);
        
    }
    public int findheight(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(findheight(root.left),findheight(root.right));
    }
}