class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String>set = new HashSet();
        for(int j=0;j<emails.length;j++)
        {
            StringBuilder sb = new StringBuilder();
            String str=emails[j];
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='.')
                {
                    i++;
                }
                else if(str.charAt(i)=='+')
                {
                    while(str.charAt(i)!='@')
                    {
                        i++;
                    }
                    sb.append(str.substring(i));
                }
                else if(str.charAt(i) == '@'){
                    sb.append(str.substring(i));
                   
                }
                sb.append(str.charAt(i));
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}