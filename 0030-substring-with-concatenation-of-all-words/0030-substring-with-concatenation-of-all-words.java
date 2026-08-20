class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        int n = s.length();
        int w = words.length, l = words[0].length();
        int tot = w*l;
        if(tot>n) return ans;

        HashMap<String, Integer> tar = new HashMap<>();
        for(String i:words){
            tar.put(i, tar.getOrDefault(i,0)+1);
        }
        for(int i=0;i<l;i++){
            int left = i;
            int right = i;
            int match = 0;
            HashMap<String, Integer> wm = new HashMap<>();
            while(right+l <= n){
                String word = s.substring(right, right+l);
                right+=l;
                if(tar.containsKey(word)){
                    wm.put(word, wm.getOrDefault(word, 0)+1);
                    match++;
                    while(wm.get(word) > tar.get(word)){ // if word freq exceeds targets
                        String leftword = s.substring(left, left+l);
                        wm.put(leftword, wm.get(leftword)-1);
                        match--;
                        left+=l;
                    }
                    if(match == w){
                        ans.add(left);
                    }
                }
                else{
                    left = right;
                    match = 0;
                    wm.clear();
                }
            }
        }
        return ans;
    }
}