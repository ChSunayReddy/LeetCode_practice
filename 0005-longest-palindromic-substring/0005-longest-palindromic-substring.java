class Solution {
    public String longestPalindrome(String s) {
         int n = s.length();
        String result = "";

        for(int i=0;i<n;i++){ //odd string
            int start = i;
            int end = i;
            while(start>=0 && end < n && s.charAt(start) == s.charAt(end)){
                start--;
                end++;
            }
            String temp = s.substring(start+1,end);
            if(temp.length() > result.length()){
                result = temp;
            }
        }

        for(int i=0;i<n;i++){ //even string
            int start = i;
            int end = i+1;
            while(start>=0 && end < n && s.charAt(start) == s.charAt(end)){
                start--;
                end++;
            }
            String temp = s.substring(start+1,end);
            if(temp.length() > result.length()){
                result = temp;
            }
        }

        return result;
    }
}