class Solution {
    public long minimumDifference(int[] nums) {
        int n=nums.length,k=n/3;
        long[] lm=new long[n];
        long[] xm=new long[n];
        long ls=0,rs=0,md=Long.MAX_VALUE;
        PriorityQueue<Integer> mlh=new PriorityQueue<>((a,b)-> b-a);
        PriorityQueue<Integer> xrh=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            mlh.offer(nums[i]);
            ls+=nums[i];
        }
        lm[k-1]=ls;
        for(int i=k;i<n-k;i++){
            int x=nums[i];
            if(x<mlh.peek()){
                ls+=x-mlh.poll();
                mlh.offer(x);
            }
            lm[i]=ls;
        }
        for(int i=n-1;i>=n-k;i--){
            xrh.offer(nums[i]);
            rs+=nums[i];
        }
        xm[n-k]=rs;
        for(int i=n-k-1;i>=k-1;i--){
            int x=nums[i];
            if(x>xrh.peek()){
                rs+=x-xrh.poll();
                xrh.offer(x);
            }
            xm[i]=rs;
        }
        for(int i=k-1;i<n-k;i++){
            md=Math.min(md,lm[i]-xm[i+1]);
        }
        return md;
    }
}