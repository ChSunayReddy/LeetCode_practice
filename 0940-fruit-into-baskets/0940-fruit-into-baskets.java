class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        int l=0,max=0;
        for(int i=0;i<n;i++){
            h.put(fruits[i],h.getOrDefault(fruits[i],0)+1);
            while(h.size()>2){
                h.put(fruits[l],h.get(fruits[l])-1);
                if(h.get(fruits[l])==0){
                    h.remove(fruits[l]);
                }
                l++;
            }
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}