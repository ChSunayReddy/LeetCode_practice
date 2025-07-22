class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> l=new ArrayList<>();
        if(p.length()>s.length()) return l;
        int[] pc=new int[26];
        int[] sc=new int[26];
        int k=p.length();
        for(char ch:p.toCharArray()){
            pc[ch-'a']++;
        }
        for(int i=0;i<s.length();i++){
            sc[s.charAt(i)-'a']++;
            if(i>=k){
                sc[s.charAt(i-k)-'a']--;
            }
            if(Arrays.equals(sc,pc)) l.add(i-k+1);
        }
        return l;
    }
}