class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
       for(int n:nums){
           List<Integer> factors = new ArrayList<>();
            if(n<=1) continue;
            int c=0;
            for(int i=1;i*i<=n;i++){
                if(n%i==0){
                    c+=2;
                    if(i*i==n) c--;
                    factors.add(i);
                    if(i * i != n) factors.add(n / i);
                }
            }
            if(c==4 && factors.size() == 4){
                for(int i:factors) sum+=i;
            }
       }
       return sum;
    }
}