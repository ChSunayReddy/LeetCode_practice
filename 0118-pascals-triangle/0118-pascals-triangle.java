class Solution {

    List<Integer> generateRow(int row ) {
        List<Integer> temp = new ArrayList<>();
        temp.add(1); 
        int res = 1;
        for(int i=1;i<row; i++) {
            res = res *(row - i );
            res = res/(i);
            temp.add(res);
        }
        
        return temp;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=1;i<= numRows;i++) {
            ans.add(generateRow(i));
        }
        return ans;
    }
}