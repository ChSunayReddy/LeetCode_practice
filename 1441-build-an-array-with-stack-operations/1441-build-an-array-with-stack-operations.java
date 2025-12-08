class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> l =new ArrayList<>();
        int m = target.length;
        int j=0;
        int i=1;
        while(i<=n){
            if(j==m) return l;
            l.add("Push");
            if(target[j]==i){
                j++;
            }
            else l.add("Pop");
            i++;
        }
        return l;
    }
}