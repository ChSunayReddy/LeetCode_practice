class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
        // int mask = 0x55555555;
        // boolean ans = (n & mask)!=0 ? true : false;
        // return n>=0 && (n&(n-1))==0 && ans;
    }
}