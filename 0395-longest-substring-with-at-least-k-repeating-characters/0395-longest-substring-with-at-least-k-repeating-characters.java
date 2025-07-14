class Solution {
    public int longestSubstring(String s, int k) {
        int n=s.length();
        int[] f=new int[26];
        for(char ch : s.toCharArray()){
            f[ch-'a']++;
        }
        for(int i=0;i<n;i++){
            if(f[s.charAt(i)-'a']<k){
                int l=longestSubstring(s.substring(0,i),k);
                int r=longestSubstring(s.substring(i+1),k);
                return Math.max(l,r);
            }
        }
        return n;
    }
}