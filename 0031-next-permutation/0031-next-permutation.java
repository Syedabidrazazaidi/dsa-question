class Solution {
    public void nextPermutation(int[] nums) {
       int idx=-1;
       int n=nums.length;
       for(int i=n-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
            idx=i;break;
        }
       }
       if(idx==-1){
        reverse(nums,0,n-1);
        return;
       }
       int j=-1;
       for(int i= n-1;i>=0;i--){
           if(nums[idx]<nums[i]){ swap(nums,idx,i);break;}
       }
      reverse(nums,idx+1,n-1);
    }
    public void swap(int []nums,int idx,int j ){
        int temp=nums[idx];
         nums[idx]=nums[j];
         nums[j]=temp;
    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}