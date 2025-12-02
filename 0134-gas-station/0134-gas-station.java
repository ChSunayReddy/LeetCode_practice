class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int gs = 0;
        int cs=0;
        for(int i=0;i<n;i++){
            cs+=cost[i];
            gs+=gas[i];
        }
        if(gs<cs) return -1;
        int start = 0,bal=0,i=0;
        while(i<n){
            bal+=gas[i]-cost[i];
            if(bal<0){
                start=i+1;
                bal=0;
            } 
            i++;
        }
        return start;
    }
}