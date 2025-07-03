class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n=s.length();
        long ts=0;
        char[] ch=new char[n];
        for(int i=n-1;i>=0;i--){
            ts=(ts+shifts[i])%26;
            ch[i]=(char)((s.charAt(i)-'a'+ts)%26+'a');
        }
        return new String(ch);
    }
}