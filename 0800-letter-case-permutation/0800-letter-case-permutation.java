class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res= new ArrayList<>();
        backtrack(new StringBuilder(s),0,res);
        return res;
    }
    public void backtrack(StringBuilder sb,int i, List<String> res){
        if(i==sb.length()){
            res.add(sb.toString());
            return;
        }
        if(Character.isDigit(sb.charAt(i))){
            backtrack(sb,i+1,res);
            return;
        }
        sb.setCharAt(i,Character.toLowerCase(sb.charAt(i)));
        backtrack(sb,i+1,res);
        sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
        backtrack(sb,i+1,res);
    }
}