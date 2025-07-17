class Solution {
    public String firstPalindrome(String[] words) {
        for(String i:words){
            if(palindrome(i)) return i;
        }
        return "";
    }
    public boolean palindrome(String s){
        int n=s.length();
        int st=0,e=n-1;
        while(st<=e){
            if(s.charAt(st)!=s.charAt(e)){
                return false;
            }
            st++;
            e--;
        }
        return true;
    }
}