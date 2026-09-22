class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int ab = 0;
        int ba = 0;
        for(int i=0;i<n;i++){
            char exab = (i%2==0) ? '0' : '1';
            char exba = (i%2==0) ? '1' : '0';
            if(s.charAt(i)!=exab) ab++;
            if(s.charAt(i)!=exba) ba++;
        }
        return Math.min(ab, ba);
    }
}