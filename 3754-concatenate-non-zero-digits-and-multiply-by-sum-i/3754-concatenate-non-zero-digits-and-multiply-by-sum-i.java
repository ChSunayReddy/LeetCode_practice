class Solution {
    public long sumAndMultiply(int n) {
        long num = 0;
        long sum = 0, rev = 0;
        while(n>0){
            int rem = n%10;
            if(rem!=0){
                num = num*10+rem;
                sum+=rem;
                n/=10;
            }
            else n/=10;
        }
        long an = num;
        while(an>0){
            rev = rev*10+(an%10);
            an/=10;
        }
        return rev*sum;
    }
}