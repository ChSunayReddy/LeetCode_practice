class Solution {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        if(k>s.length()){
            reverse(ch,0,ch.length-1);
            for(char i:ch) sb.append(i);
            return sb.toString();
        }
        int c=0;
        int size = 2*k;
        int i=0;
        for(i=0;i<ch.length && (ch.length-i)>=k;i+=size){
            //System.out.println("Before Sorted : "+ i + " is "+ Arrays.toString(ch));
            reverse(ch, i, i+k-1);
            //System.out.println("Afer Sorted : "+ i + " is "+ Arrays.toString(ch));
        }
        int remainlen = ch.length-i;
        if(remainlen < size && remainlen >= k) reverse(ch, i, i+k);
        else reverse(ch, i, ch.length-1);
        for(char cha : ch) sb.append(cha);
        return sb.toString();
    }
    public void reverse(char[] ch, int i, int j){
        while(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
    }
}