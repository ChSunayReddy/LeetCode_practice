class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        HashMap<Character,Integer> h1=new HashMap<>();
        HashMap<Character,Integer> h2=new HashMap<>();

        for(char ch:word1.toCharArray()){
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }
        for(char ch:word2.toCharArray()){
            h2.put(ch,h2.getOrDefault(ch,0)+1);
        }
        if(!h1.keySet().equals(h2.keySet())){
            return false;
        }
        List<Integer> l1=new ArrayList<>(h1.values());
        List<Integer> l2=new ArrayList<>(h2.values());
        Collections.sort(l1);
        Collections.sort(l2);
        return l1.equals(l2);
    }
}