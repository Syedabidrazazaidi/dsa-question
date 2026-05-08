class Solution {
    public boolean search(int[] nums, int target) {
          int s=0,l=nums.length-1;
        while(s<=l){
            int m=s+(l-s)/2;
            if(target==nums[m]){return true;}
            if(nums[m]==nums[s]){s++;continue;}
            else if(nums[s]<=nums[m]){
                if(nums[m]>target && target>=nums[s]){l=m-1;
                 }else{s=m+1;}
            }
            else{
                if(nums[m]<target && target<=nums[l]){s=m+1;}
                else{l=m-1;}
            }
        }
        return false;
    }
}