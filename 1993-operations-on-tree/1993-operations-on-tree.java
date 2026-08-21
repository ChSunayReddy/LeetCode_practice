class LockingTree {
    private final int[] parent;
    private final int[] lockedBy;
    private final List<List<Integer>> children;
    public LockingTree(int[] parent) {
        int n = parent.length;
        this.parent = parent;
        this.lockedBy = new int[n];
        Arrays.fill(this.lockedBy, -1);

        this.children = new ArrayList<>();
        for(int i=0;i<n;i++){
            children.add(new ArrayList<>());
        }
        for(int i=1;i<n;i++){
            children.get(parent[i]).add(i);
        }
    }
    private boolean hasLockedAncestors(int num){
        int cur = parent[num];
        while(cur!=-1){
            if(lockedBy[cur] != -1) return true;
            cur = parent[cur];
        }
        return false;
    }
    private boolean unlockDescendants(int num) {
        boolean anyLocked = false;
        for (int child : children.get(num)) {
            if (lockedBy[child] != -1) {
                anyLocked = true;
                lockedBy[child] = -1;
            }
            if (unlockDescendants(child)) {
                anyLocked = true;
            }
        }
        return anyLocked;
    }
    public boolean lock(int num, int user) {
        if(lockedBy[num] != -1) return false;
        lockedBy[num] = user;
        return true;
    }
    
    public boolean unlock(int num, int user) {
        if(lockedBy[num] != user) return false;
        lockedBy[num] = -1;
        return true;
    }
    
    public boolean upgrade(int num, int user) {
        if(lockedBy[num] != -1) return false;
        if(hasLockedAncestors(num)) return false;
        if(!unlockDescendants(num)) return false;
        lockedBy[num] = user;
        return true;
    }
}

/**
 * Your LockingTree object will be instantiated and called as such:
 * LockingTree obj = new LockingTree(parent);
 * boolean param_1 = obj.lock(num,user);
 * boolean param_2 = obj.unlock(num,user);
 * boolean param_3 = obj.upgrade(num,user);
 */