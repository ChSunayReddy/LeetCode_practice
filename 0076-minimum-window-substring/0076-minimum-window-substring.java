class Solution {
    public String minWindow(String s, String t) {
        int m = s.length(), n = t.length();
        String ans = "";
        if (n > m) return ans;
        int[] requiredFreq = new int[128];
        int matched = 0, i = 0, j = 0;
        for(char ch: t.toCharArray()) {
            requiredFreq[ch]++;
        }
        while (j < m) {
            if (requiredFreq[s.charAt(j)] > 0) {
                matched++;
            }
            requiredFreq[s.charAt(j)]--;
            if (matched == n) {
                while(matched == n) {
                    requiredFreq[s.charAt(i)]++;
                    if (requiredFreq[s.charAt(i)] > 0) {
                        matched--;
                    }
                    i++;
                }
                if (ans.length() == 0 || ans.length() > j-i+2) {
                    ans = s.substring(i-1,j+1);
                }
            }
            j++;
        }
        return ans;
    }
}