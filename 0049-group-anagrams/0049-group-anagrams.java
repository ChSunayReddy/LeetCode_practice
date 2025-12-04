class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        for(String str:strs){
            String s=sort(str);
            if(!map.containsKey(s)) map.put(s,new ArrayList<>());
            map.get(s).add(str);
        }
        return new ArrayList<>(map.values());
    }
    public static String sort(String a){
        char[] ch=a.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}