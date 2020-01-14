class Leaderboard {
    
    HashMap<Integer,Integer> map;
   
    public Leaderboard() {
        map=new HashMap();
        
    }
    
    public void addScore(int playerId, int score) {
       if(!map.containsKey(playerId))
       {
       map.put(playerId,score); 
       }
       else{
        map.put(playerId,map.get(playerId)+score);
        }
    }
    
    public int top(int K) {
        int sum=0;
        int count=0;

        ArrayList<Integer> list = new ArrayList();
        for(int i=1;i<=map.size();i++)
        {
             list.add(map.get(i));
        }

        Collections.sort(list, Collections.reverseOrder()); 
        
        while(K>0){
           sum+=list.get(count);
           count++;
            K--;
            
        }
        return sum;
    }
    
    public void reset(int playerId) {
       
            map.put(playerId,0);
        
    }
}

/**
 * Your Leaderboard object will be instantiated and called as such:
 * Leaderboard obj = new Leaderboard();
 * obj.addScore(playerId,score);
 * int param_2 = obj.top(K);
 * obj.reset(playerId);
 */