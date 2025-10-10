class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(0,-1);
        int sum=0;
        int maxlen=0;
        for(int i=0;i<n;i++){
            sum+= (nums[i]==0) ? -1 : 1;
            if(h.containsKey(sum)){
                maxlen=Math.max(maxlen,i-h.get(sum));
            }
            else{
                h.put(sum,i);
            }
        }
        return maxlen;
    }
}