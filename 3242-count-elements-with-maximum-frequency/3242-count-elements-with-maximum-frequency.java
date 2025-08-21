class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i:nums){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        int max=0;
        for(int num:h.values()){
            max=Math.max(max,num);
        }
        int c=0;
        for(int i:nums){
            if(h.get(i)==max) c++;
        }
        return c;
    }
}