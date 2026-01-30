class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        //Floyd Warshall's algorithm
        if (source.length() != target.length()) return -1;
        long INF = (long) 1e18;
        long[][] distance=new long[26][26];
        for(int i=0;i<26;i++){
           Arrays.fill(distance[i],INF);
           distance[i][i]=0;
        }
        for(int i=0;i<original.length;i++){
            int start=original[i]-'a';
            int end=changed[i]-'a';
            distance[start][end]=Math.min(distance[start][end],cost[i]);
        }
        for(int k=0;k<26;k++){
            for(int i=0;i<26;i++){
                for(int j=0;j<26;j++){
                    if(distance[i][k]+distance[k][j]<distance[i][j]){
                        distance[i][j]=distance[i][k]+distance[k][j];
                    }
                }
            }
        }
        long sum=0;
        for(int i=0;i<source.length();i++){
            int u=source.charAt(i)-'a';
            int v=target.charAt(i)-'a';
            if(distance[u][v]==INF) return -1;
            sum+=distance[u][v];
        }
        return sum;
    }
}