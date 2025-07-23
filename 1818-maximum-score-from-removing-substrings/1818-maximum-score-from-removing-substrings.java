class Solution {
    public int maximumGain(String s, int x, int y) {
        StringBuilder sb=new StringBuilder(s);
        int res=0;
        res+=(x>y) ? remove(sb,"ab",x)+remove(sb,"ba",y) : remove(sb,"ba",y)+remove(sb,"ab",x);
        return res;
    }
    public int remove(StringBuilder sb,String pair,int score){
        StringBuilder st=new StringBuilder();
        int res=0;
        for(int i=0;i<sb.length();++i){
            char c=sb.charAt(i);
            if(st.length()>0 && c==pair.charAt(1) && st.charAt(st.length()-1)==pair.charAt(0)){
                st.deleteCharAt(st.length()-1);
                res+=score;
            }
            else{
                st.append(c);
            }
        }
        sb.setLength(0);
        sb.append(st);
        return res;
    }
}