class Solution {
    public boolean isFascinating(int n) {
        HashSet<Integer> set=new HashSet<>();
        int n2=2*n;
        int n3=3*n;
        String s=Integer.toString(n)+Integer.toString(n2)+Integer.toString(n3);
        for(char ch:s.toCharArray()){
            int m=ch-'0';
            if(m==0 || set.contains(m)){
                return false;
            }
            set.add(m);
        }
        return true;
    }
}