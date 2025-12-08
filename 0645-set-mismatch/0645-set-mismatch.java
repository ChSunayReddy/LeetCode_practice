class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int[] ans = new int[2];
        HashMap<Integer,Integer> h= new HashMap<>();
        int sum=0,max=0;
        for(int i=1;i<=n;i++){
            max+=i;
        }
        for(int i: nums){
            h.put(i,h.getOrDefault(i,0)+1);
            sum+=i;
        }
        for(var e : h.entrySet()){
            if(e.getValue()==2) ans[0] = e.getKey();
        }
        ans[1] = (max-sum)+ans[0];
        return ans;
    }
}