class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        for(int i : nums1){
            seen.add(i);
        }
        for(int i : nums2){
            if(seen.contains(i)) res.add(i);
        }
        int[] ans = new int[res.size()];
        int ind = 0;
        for(int i:res) ans[ind++] = i;
        return ans;
    }
}