class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> visited = new HashSet();
        visited.add(0);
        Stack<Integer> stack = new Stack();
        stack.add(0);
        while(!stack.isEmpty())
        {
           List<Integer> list = rooms.get(stack.pop());
            for(int i : list)
            {
                if(!visited.contains(i))
                {
                stack.add(i);
                visited.add(i);
                }
            }
        }
        return visited.size()==rooms.size();
    }
}