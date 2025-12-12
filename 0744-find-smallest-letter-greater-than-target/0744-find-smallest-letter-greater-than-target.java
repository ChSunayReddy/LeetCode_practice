class Solution {
    public char nextGreatestLetter(char[] let, char tar) {
        int n=let.length,l=0,r=n-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(let[mid]<=tar) l=mid+1;
            else r=mid-1;
        }
        if(l<n) return let[l];
        else return let[0];
    }
}