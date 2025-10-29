class Solution {
    int c=0;
    public int numTilePossibilities(String tiles) {
        char[] ch=tiles.toCharArray();
        Arrays.sort(ch);
        boolean[] bool = new boolean[ch.length];
        c=0;
        backtrack(ch,bool, new StringBuilder());
        return c;
    }
    public void backtrack(char[] ch,boolean[] bool,StringBuilder sb){
        if(sb.length()>0){
            c++;
        }
        for(int i=0;i<ch.length;i++){
            if(bool[i]) continue;
            if(i>0 && ch[i]==ch[i-1] && !bool[i-1]) continue;
            bool[i]=true;
            sb.append(ch[i]);
            backtrack(ch,bool,sb);
            sb.deleteCharAt(sb.length()-1);
            bool[i]=false;
        }
    }
}