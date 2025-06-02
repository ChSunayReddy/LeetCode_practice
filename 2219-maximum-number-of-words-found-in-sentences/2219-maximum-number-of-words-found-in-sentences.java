class Solution {
    public int mostWordsFound(String[] sentences) {
        int c=0;
        for(String i:sentences){
            String[] s=i.split(" ");
            c=Math.max(c,s.length);
        }
        return c;
    }
}