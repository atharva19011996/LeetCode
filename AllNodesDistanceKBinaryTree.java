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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        HashMap<TreeNode,TreeNode> map = new HashMap();
        populatemap(root,map,null);
        Queue<TreeNode> queue = new LinkedList();
        HashSet<TreeNode> set = new HashSet();
        int currentlevel=0;
        queue.add(target);
        set.add(target);
        while(!queue.isEmpty())
        {
        if(currentlevel==K)
        {
            return result(queue);
        }
        int size = queue.size();
        for(int i=0;i<size;i++)
        {
        TreeNode current = queue.poll();
        if(current.left!=null &&!set.contains(current.left)){
            queue.add(current.left);
            set.add(current.left);
            
            
        }
        if(current.right!=null && !set.contains(current.right)){
            queue.add(current.right);
            
            set.add(current.right);
            }
        TreeNode parentOfCurrentNode = map.get(current);
         if(parentOfCurrentNode != null&& !set.contains(parentOfCurrentNode))
         {
             set.add(parentOfCurrentNode);
             queue.add(parentOfCurrentNode);
         }   
        }
        currentlevel++;


   
        }


    return new ArrayList<Integer>();    
}

    public void populatemap(TreeNode root,HashMap<TreeNode,TreeNode> map, TreeNode parent)
    {
        if(root==null){
            return;
        }
        map.put(root,parent);
        if(root.left!=null){
           populatemap(root.left,map,root); 
        }
        if(root.right!=null){
            populatemap(root.right,map,root);
        }
    }
    public List<Integer> result(Queue<TreeNode> queue){
        List<Integer> answer = new ArrayList();
        for(TreeNode i : queue)
        {
            answer.add(i.val);
        }
        return answer;
    }
}