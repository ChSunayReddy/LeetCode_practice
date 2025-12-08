class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new  HashMap<>();
        int [] sorted=nums.clone();
        Arrays.sort(sorted);
        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(sorted[i]))
            {
                map.put(sorted[i],i);
            }
        } 
        int result[]=new int[n];
        for(int i=0;i<n;i++)
        {
            result[i]=map.get(nums[i]);
        } 
        return result;
    }
}