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
    public int minDiffInBST(TreeNode root) {
        if(root==null){
            return 0; 
        }
        List<Integer>list = new ArrayList();
       add(root,list); 
       Collections.sort(list);
       int ans = Integer.MAX_VALUE;
       for(int i=0;i<list.size()-1;i++){
           ans = Math.min(ans, list.get(i+1)-list.get(i));
       } 
       return ans; 
    }
    public void add(TreeNode root,List<Integer> list ){
        
        
        list.add(root.val);
        if(root.left!=null){
            add(root.left,list);
        }
        if(root.right!=null){
            add(root.right,list);
        } 
        
    } 
}