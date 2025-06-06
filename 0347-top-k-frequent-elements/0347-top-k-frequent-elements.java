class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i:nums){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> m=new PriorityQueue<>((a,b) -> a.getValue()-b.getValue());
        int j=0;
        for(Map.Entry<Integer,Integer>  i:h.entrySet()){
           m.offer(i);
           if(m.size()>k){
            m.poll();
           }
        }
        int[] ans=new int[k];
        while(!m.isEmpty()){
            ans[j++]=m.poll().getKey();
        }
        return ans;
    }
}