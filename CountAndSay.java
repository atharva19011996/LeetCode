class Solution {
    public String countAndSay(int n) {
       
    if(n==1)
    {
        return "1";
    }
    String str =  countAndSay(n-1);
    StringBuilder sb = new StringBuilder();
    int count=0;    
    for(int i=0;i<=str.length();i++)
    {
        if(i==str.length() || (i>0 && str.charAt(i)!=str.charAt(i-1)))
        {
            sb.append(count);
            sb.append(str.charAt(i-1));
            count=0;
        }
        count++;
        
    }
       return sb.toString(); 
        
    }
}