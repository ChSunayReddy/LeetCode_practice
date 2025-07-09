class Solution {
    public int maxVowels(String s, int k) {
        int v=0;
        String sub="";
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            sub+=ch;
            if(isvowel(ch)){
                v++;
            }
        }
        int mv=v;
        for(int i=k;i<s.length();i++){
            char ch=s.charAt(i);
            char fir=s.charAt(i-k);
            if(isvowel(ch)){
                v++;
            }
            if(isvowel(fir)) v--;
            mv=Math.max(mv,v);
        }
        return mv;
    }
    public boolean isvowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                return true;
        }
        return false;
    }
}