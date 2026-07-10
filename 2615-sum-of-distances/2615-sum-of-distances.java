class Solution {
    public long[] distance(int[] nums) {
        HashMap<Integer,List<Integer>> hm = new HashMap<>();
        int n = nums.length;
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            hm.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        for(List<Integer> pos : hm.values()){
            long sum = 0;
            for(int x:pos) sum+=x;
            long ls = 0;
            int m = pos.size();
            for(int i=0;i<m;i++){
                long rs = sum-ls-pos.get(i);
                long left = (long) pos.get(i)*i - ls;
                long right = rs - (long) pos.get(i) * (m-i-1);
                arr[pos.get(i)] = left+right;
                ls+=pos.get(i);
            }
        }
        return arr;
    }
}