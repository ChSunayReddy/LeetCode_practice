class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch:s.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch,0)+1);
        } 
        List<Map.Entry<Character, Integer>> l = new ArrayList<>(hm.entrySet());
        // Sorting
        l.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        //store
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> i : l){
            for(int j=0;j<i.getValue();j++) sb.append(i.getKey());
        }
        return sb.toString();
    }
}