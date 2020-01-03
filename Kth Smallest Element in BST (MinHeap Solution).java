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
    public int kthSmallest(TreeNode root, int k) {
       
    PriorityQueue<Integer> minheap=new PriorityQueue();
    if(root==null)
    {
        return 0;
    }
    createminheap(minheap,root);
        int i=0;
            int res=0;
    while(i<k)
    {
        res=minheap.remove();
        i++;
    }
       return res;
        
    }
public void createminheap(PriorityQueue<Integer> minheap,TreeNode root)
{
    if(root==null)
    {
        return;
    }
    minheap.add(root.val);
    if(root.left!=null)
    {
      createminheap( minheap,root.left);  
    }
    if(root.right!=null)
    {
      createminheap( minheap,root.right);  
    }
}

}

