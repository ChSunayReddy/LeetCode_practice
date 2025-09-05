class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for(int i=1;i<=60;i++){
            long num=1L*num1-1L*num2*i;
            if(num<i){
                return -1;
            }
            if(i>=Long.bitCount(num)){
                return i;
            }
        }
        return -1;
    }
}