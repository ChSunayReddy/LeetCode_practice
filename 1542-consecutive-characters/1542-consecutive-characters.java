class Solution {
    public int maxPower(String s) {
        int max=0,m=0;
        char[] ch=s.toCharArray();
        for(int i=1;i<s.length();i++){
            if(ch[i]==ch[i-1]) m++;
            else m=0;
            max=Math.max(max,m);
        }
        return max+1;
    }
}