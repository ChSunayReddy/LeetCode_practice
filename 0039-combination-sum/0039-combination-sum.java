class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> res=new ArrayList<>();
       backtrack(candidates, target, 0, new ArrayList<>(),res);
       return res;
    }
    public void backtrack(int[] cand,int tar,int start,List<Integer> cur,List<List<Integer>> res){
        if(tar==0){
            res.add(new ArrayList<>(cur)); //copy od current
            return ;
        }
        if(tar<0) return;
        //all possibilities
        for(int i=start;i<cand.length;i++){
            cur.add(cand[i]);
            backtrack(cand,tar-cand[i],i,cur,res);
            cur.remove(cur.size()-1);
        }
    }
}