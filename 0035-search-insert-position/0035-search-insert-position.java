class Solution {
    public int searchInsert(int[] nums, int target) {
        int st =0;
        int l=nums.length-1;
        while(st<=l){
            int m=(st+l)/2;
            if(nums[m]>target){
                l=m-1;
            }
            else if(nums[m]<target){st=m+1;}
            else{return m;}
           
        }
        return st;
    }
}