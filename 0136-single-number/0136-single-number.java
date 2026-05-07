class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        if(n==1){return nums[0];}
         int ans=0;
       for(int x=0;x<n;x++){
       ans=ans^nums[x];
       }
      return ans;
    }
}