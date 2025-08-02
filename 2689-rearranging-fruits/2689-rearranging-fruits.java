class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        int n=basket1.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        HashMap<Integer,Integer> c=new HashMap<>();
        long min=Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            c.put(basket1[i],c.getOrDefault(basket1[i],0)+1);
            h.put(basket1[i],h.getOrDefault(basket1[i],0)+1);
            h.put(basket2[i],h.getOrDefault(basket2[i],0)+1);
        }
        for(var i:h.entrySet()){
            if(i.getValue()%2!=0) return -1;
            min=Math.min(min,i.getKey());
        }
        List<Long> fswap=new ArrayList<>();
        for(var i:h.entrySet()){
            int f=i.getKey();
            int diff=c.getOrDefault(f,0)-(i.getValue()/2);
            for(int j=0;j<Math.abs(diff);j++){
                fswap.add((long)f);
            }
        }
        Collections.sort(fswap);
        long totalcost=0;
        int sm=fswap.size()/2;
        for(int i=0;i<sm;i++){
            totalcost+=Math.min(fswap.get(i),2*min);
        }
        return totalcost;
    }
}