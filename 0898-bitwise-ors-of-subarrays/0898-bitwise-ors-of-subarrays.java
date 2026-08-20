class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        int tot = 0, n = arr.length;
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> prev = new HashSet<>();
        for(int i:arr){
            HashSet<Integer> cur = new HashSet<>();
            cur.add(i);
            for(int pre:prev){
                cur.add(pre|i);
            }
            hs.addAll(cur);
            prev = cur;
        }
        return hs.size();
    }
}