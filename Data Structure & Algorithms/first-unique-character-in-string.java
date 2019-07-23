public int firstUniqChar(String s) {
        if(s.length() ==0 || s==null) return -1;
        
        char[] freq = new char[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0; i<s.length(); i++){
            if(freq[s.charAt(i)-'a']==1)
                return i;
        }
        return -1;
        
    }
