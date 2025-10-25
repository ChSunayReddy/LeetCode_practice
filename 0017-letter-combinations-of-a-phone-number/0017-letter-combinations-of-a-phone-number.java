class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits.isEmpty()) return res;
        backtrack(digits,0,new StringBuilder (),res);
        return res;
    }
    private static final String[] dtl={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public void backtrack(String s,int i,StringBuilder sb ,List<String> res){
        if(i==s.length()){
            res.add(sb.toString());
            return;
        }
        for(final char c:dtl[s.charAt(i)-'0'].toCharArray()){
            sb.append(c);
            backtrack(s,i+1,sb,res);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}