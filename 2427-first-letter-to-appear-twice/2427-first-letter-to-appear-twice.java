class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> a=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(a.contains(s.charAt(i))){
                return s.charAt(i);
            }
            else{
                a.add(s.charAt(i));
            }
        }
        return 'a';
    }
}