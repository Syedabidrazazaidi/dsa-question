class Solution {
    public int findMin(int[] nums) {
          int s=0,l=nums.length-1;
        while(s<l){
            int m=s+(l-s)/2;
            if(nums[m]>nums[l] && nums[s]>nums[l]){s=m+1;}
            else if(nums[m]<nums[l]){l--;}
            
        }
        return nums[s];
    }
}