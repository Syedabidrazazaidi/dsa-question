class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        ans[0]=find(nums,target,true);
        ans[1]=find(nums,target,false);
        return ans;
    }
    public int find(int nums[],int target,boolean first){
         int st =0;
        int l=nums.length-1;
        int bound=-1;
        while(st<=l){
            int m=(st+l)/2;
            if(nums[m]>target){
                l=m-1;
            }
            else if(nums[m]<target){st=m+1;}
            else{
               bound=m;
               if(first){l=m-1;}
               else{st=m+1;}
                }
        }
        return bound;
    }   
    
}