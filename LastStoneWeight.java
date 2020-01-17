class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones==null || stones.length==0){
            return 0;
        }
        PriorityQueue<Integer> maxheap = new PriorityQueue(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++)
        {
            maxheap.add(stones[i]);
        }
        while(maxheap.size()>1)
        {
              int a = maxheap.remove();
              int b=maxheap.remove();
              maxheap.add(a-b);
         }  
            
        
        return maxheap.remove();
    }
}