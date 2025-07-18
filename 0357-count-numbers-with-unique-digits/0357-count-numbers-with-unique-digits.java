class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        int res=10;
        int ud=9;
        int av=9;
        while(n>1 && av>0){
            ud=ud*av;
            res+=ud;
            av--;
            n--;
        }
        return res;
    }
}