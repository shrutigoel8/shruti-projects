public class Solution {
    
    public String helper(String a, int start, int end){
        if(a.length()==0|| a==null)
            return null;
        while(start>=0&& end<=a.length()-1 && a.charAt(start)==a.charAt(end)){
            start--;
            end++;
            
        }
        return a.substring(start+1,end);
    }
    public String longestPalindrome(String s) {
        String longest=s.substring(0,1);
        if(s.length()==0||s==null)
            return null;
        for(int i=0; i<s.length(); i++){
            String temp=helper(s,i,i);
            if(temp.length()>longest.length())
                longest=temp;
            temp=helper(s,i,i+1);
            if(temp.length()>longest.length())
                longest=temp;
            
        }
        return longest;
    }
}