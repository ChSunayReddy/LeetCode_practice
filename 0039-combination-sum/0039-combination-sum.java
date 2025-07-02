class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        return backtrack(candidates,target,new ArrayList<>(),new ArrayList<>(),0);
        
    }
    public List<List<Integer>> backtrack(int[] c,int k,List<List<Integer>> l,List<Integer> t,int i){
        if(k==0){
            l.add(new ArrayList<>(t));
            return l;
        }
        for(;i<c.length;i++){
            if(k-c[i]<0) return l;
            t.add(c[i]);
            backtrack(c,k-c[i],l,t,i);
            t.remove(t.size()-1);
        }
        return l;
    }
}