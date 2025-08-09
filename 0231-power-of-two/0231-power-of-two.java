class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        if(n<=2) return true;
        if(n%2!=0) return false;
        else if(n%2==0){
            while(n!=2){
                n/=2;
                if(n%2!=0) return false;
            }
        }
        return n==2;
    }
}