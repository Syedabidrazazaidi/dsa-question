class Solution {
    public int findPeakElement(int[] nums) { 
        int s=0;int l=nums.length-1;
        int n=nums.length;
       
        while(s<l){
            int m=s+(l-s)/2;
            if(nums[m]<nums[m+1]){s=m+1;}
            else{l=m;}
        }return s;
    }
}