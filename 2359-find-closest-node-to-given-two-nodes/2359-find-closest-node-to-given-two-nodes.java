class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int[] dist1 = new int[n];
        int[] dist2 = new int[n];
        Arrays.fill(dist1,-1);
        Arrays.fill(dist2,-1);

        distances(node1, edges, dist1);
        distances(node2, edges, dist2);
        int mindist = Integer.MAX_VALUE;
        int resultnode = -1;
        for(int i=0;i<n;i++){
            if(dist1[i]!=-1 && dist2[i]!=-1){
                int maxdist = Math.max(dist1[i], dist2[i]);
                if(maxdist < mindist){
                    mindist = maxdist;
                    resultnode = i;
                }
            }
        }
        return resultnode;
    }
    private void distances(int src, int[] edges, int[] dist){
        int d=0;
        int cur = src;
        while(cur != -1 && dist[cur]==-1){
            dist[cur] = d++;
            cur = edges[cur];
        }
    }
}