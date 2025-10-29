class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),res);
        return res;
    }
    public void backtrack(int[] nums,int start,List<Integer> cur, List<List<Integer>> res ){
        //Add cur subset
        res.add(new ArrayList<>(cur));
        //all possibilities
        for(int i=start;i<nums.length;i++){
            cur.add(nums[i]);
            backtrack(nums,i+1,cur,res);
            cur.remove(cur.size()-1);
        }
    }
}