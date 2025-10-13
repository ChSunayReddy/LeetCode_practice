class Solution {
    public List<String> removeAnagrams(String[] word) {
        List<String> res=new ArrayList<>();
        for(String i:word){
            res.add(i);
        }
        for(int i=1;i<word.length;i++){
            if (isAnagram(word[i-1],word[i])){
                res.remove(word[i]);
            }
        }
        return res;
    }
    public boolean isAnagram(String s,String t){
        int[] ch=new int[26];
        for(char c:s.toCharArray()){
            ch[c-'a']++;
        } 
        for(char c:t.toCharArray()){
            ch[c-'a']--;
        }
        for(int i=0;i<26;i++){
            if(ch[i]!=0) return false;
        }
        return true; 
    }
}