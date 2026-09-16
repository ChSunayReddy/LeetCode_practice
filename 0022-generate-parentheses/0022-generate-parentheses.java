class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        gen(n, n, "", ans);
        return ans;
    }
    static void gen(int open, int close, String s, List<String> ans){
        if(open==0 && close==0){
            ans.add(s);
            return;
        }
        if(open>0){
            gen(open-1, close, s+"(", ans);
        }
        if(close>open){
            gen(open, close-1, s+")", ans);
        }
    }
}