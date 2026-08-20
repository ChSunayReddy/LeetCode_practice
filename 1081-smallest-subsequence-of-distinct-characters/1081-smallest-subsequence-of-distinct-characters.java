class Solution {
    public String smallestSubsequence(String s) {
        if(s==null || s.length()<=1) return s;
        int n = s.length();
        int[] lastind = new int[26];
        for(int i=0;i<n;i++){
            lastind[s.charAt(i) - 'a'] = i;
        }
        boolean[] instack = new boolean[26];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            int idx = ch - 'a';

            if(instack[idx]) continue;
            while(sb.length()>0 && sb.charAt(sb.length()-1) > ch && lastind[sb.charAt(sb.length()-1) - 'a'] > i){
                char removed = sb.charAt(sb.length()-1);
                sb.deleteCharAt(sb.length()-1);
                instack[removed - 'a'] = false;
            }
            sb.append(ch);
            instack[idx] = true;
        }
        return sb.toString();
    }
}