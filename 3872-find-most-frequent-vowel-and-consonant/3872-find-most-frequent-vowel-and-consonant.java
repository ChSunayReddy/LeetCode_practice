class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> v=new HashMap<>();
        HashMap<Character,Integer> c=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(isvowel(ch)){
                v.put(ch,v.getOrDefault(ch,0)+1);
            }
            else{
                c.put(ch,c.getOrDefault(ch,0)+1);
            }
        }
        int max=0;
        int max1=0;
        for(var ch:v.entrySet()){
            max=Math.max(max,ch.getValue());
        }
        for(var ch:c.entrySet()){
            max1=Math.max(max1,ch.getValue());
        }
        return max+max1;
    }
    public boolean isvowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}