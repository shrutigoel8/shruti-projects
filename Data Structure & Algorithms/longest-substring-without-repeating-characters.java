public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s==null)
            return 0; 
        int start=0;
        int i=0;
        int max=0;
        HashSet<Character> h1= new HashSet<Character>();
        while( i< s.length()){
            char c= s.charAt(i);
            if(!h1.contains(c))
                h1.add(c);
                
                
            else
              {  max=Math.max(max, h1.size());
                
                while(start<i && s.charAt(start)!=c)
                  {  h1.remove(s.charAt(start) );
                    start++;}
        
                  start++;
                  
              }i++;
        max= Math.max(max, h1.size());
    }return max;
        
    }
}