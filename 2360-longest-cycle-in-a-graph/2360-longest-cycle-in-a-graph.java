class Solution {
    public int longestCycle(int[] edges) {
        int n = edges.length;
        int[] vis = new int[n]; // 0-unvisited, 1-visited, 2-proceeded
        int maxlen = -1;
        for(int i=0;i<n;i++){
            if(vis[i] != 0) continue;
            List<Integer> path = new ArrayList<>();
            int cur = i;
            while(cur != -1 && vis[cur] == 0){
                vis[cur] = 1;
                path.add(cur);
                cur = edges[cur];
            }
            if(cur!=-1 && vis[cur]==1){
                int startind = path.indexOf(cur);
                int curlen = path.size() - startind;
                maxlen = Math.max(maxlen, curlen);
            }
            for(int node:path){
                vis[node] = 2;
            }
        }
        return maxlen;
    }
}