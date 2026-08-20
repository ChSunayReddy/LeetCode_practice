class Solution {
    public boolean canReach(int[] arr, int start) {
        if(arr[start]==0) return true;
        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n];

        q.offer(start);
        vis[start] = true;
        while(!q.isEmpty()){
            int cur = q.poll();
            if(arr[cur]==0) return true;
            int jump = arr[cur];
            int right = cur+jump;
            if(right<n && !vis[right]){
                q.offer(right);
                vis[right] = true;
            }
            int left = cur-jump;
            if(left>=0 && !vis[left]){
                q.offer(left);
                vis[left] = true;
            }
        }
        return false;
    }
}