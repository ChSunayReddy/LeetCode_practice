class Solution {
    public int maxSum(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
        for(int i:nums){
            int m = maxd(i);
            if(hm.containsKey(m)) hm.get(m).add(i);
            else{
                hm.put(m, new ArrayList<>());
                hm.get(m).add(i);
            }
        }
        int res=-1;
        for(int d : hm.keySet()){
            if(d>=1 && hm.get(d).size()>=2){
                ArrayList<Integer> l = hm.get(d);
                Collections.sort(l, Collections.reverseOrder());
                res = Math.max(res,l.get(0) + l.get(1));
            }
        }
        return res;
    }
    public static int maxd(int num){
        int max = 0;
        while(num>0){
            max = Math.max(max,num%10);
            num/=10;
        }
        return max;
    }
}