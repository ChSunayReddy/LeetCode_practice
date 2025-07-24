class Solution {
    public int maxNumberOfBalloons(String text) {
        if(text == null) return 0;
        int[] freq = new int[5];
        for(char ch : text.toCharArray()) {
            switch(ch) {
                case 'b': freq[0]++; break;
                case 'a': freq[1]++; break;
                case 'l': freq[2]++; break;
                case 'o': freq[3]++; break;
                case 'n': freq[4]++; break;
            }
        }
        freq[2] /= 2;
        freq[3] /= 2;
        int res = Integer.MAX_VALUE;
        for(int num : freq) if(num < res) res = num;
        return res;
    }
}