class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i: nums){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        int res=0;
        for(var i:h.entrySet()){
            if(i.getValue()==1){
                res=i.getKey();
                break;
            }
        }
        return res;

        // int r=0;
        // int res=0;
        // for(int i:nums){
        //     r^=i;
        //     res^=r;
        // }
        // return res;
    }
}