class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> h=new HashMap<>();
        //HashMap<Character,Integer> b=new HashMap<>();
        for(char ch:text.toCharArray()){
            h.put(ch,h.getOrDefault(ch,0)+1);
        }
        int c=0;
        // String bal="balloon";
        // for(char ch:bal.toCharArray(){
        //     b.put(ch,b.getOrDefault(ch,0)+1);
        // }
        int rb=h.getOrDefault('b',0);
        int ra=h.getOrDefault('a',0);
        int rl=h.getOrDefault('l',0)/2;
        int ro=h.getOrDefault('o',0)/2;
        int rn=h.getOrDefault('n',0);
        if(rb==ra && ra==rl && rl==ro && ro==rn) return rb;
        else{
            if(rb==0 || ra==0 || rl==0 || ro==0 || rn==0) return 0;
            else{
                int min=Integer.MAX_VALUE;
                min=Math.min(min,rb);
                min=Math.min(min,ra);
                min=Math.min(min,rl);
                min=Math.min(min,ro);
                min=Math.min(min,rn);
                return min;
            }
        }
    }
}