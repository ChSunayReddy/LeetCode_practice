class Solution {
    public int maximumLength(String s) {
        int max=-1;
        
        for(char ch='a';ch<='z';ch++){
            for(int j=1;j<=s.length();j++){
                String sub=s.valueOf(ch).repeat(j);
                int c=0;
                int ind=0;
                while((ind=s.indexOf(sub,ind))!=-1){
                    c++;
                    ind++;
                }
                if(c>=3) max=Math.max(max,sub.length());
            }
        }
        return max;
    }
}