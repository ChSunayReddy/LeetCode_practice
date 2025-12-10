class Solution {
    static final int MOD = 1000000007;
    public int countPermutations(int[] com) {
        int n = com.length;
        int min = com[0];
        int[][] arr = new int[n][2];
        for(int i=1;i<n;i++){
            if(com[i]<=min) return 0;
        }
        long fact =1;
        for(int i=2;i<n;i++){
            fact = (fact*i)%MOD;
        }
        return (int)fact;
    }
}