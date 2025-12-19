class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int c=0,max=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                c++;
            }
            else if(ch==')'){
                c--;
            }
            else continue;
            max = Math.max(max,c);
        }
        return max;
    }
}