class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        for(int i=0;i<n;i++){
            HashMap<Integer,Integer> h=new HashMap<>();
            int s=0;
            for(int j=0;j<n;j++){
                h.put(matrix[i][j],h.getOrDefault(matrix[i][j],0)+1);
                if(h.get(matrix[i][j])>1) return false;
                s+=matrix[i][j];
            }
            if(s!=sum ) return false;
        }
        for(int i=0;i<n;i++){
            HashMap<Integer,Integer> h=new HashMap<>();
            int s=0;
            for(int j=0;j<n;j++){
                h.put(matrix[j][i],h.getOrDefault(matrix[j][i],0)+1);
                if(h.get(matrix[j][i])>1) return false;
                s+=matrix[j][i];
            }
            if(s!=sum ) return false;
        }
        return true;
    }
}