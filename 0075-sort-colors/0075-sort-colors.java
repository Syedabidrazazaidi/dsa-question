class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int flag=1;
            for(int j=0;j<n-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                    flag=0;
                }
                
            }
            if(flag==1){break;}
        }
        for(int x:nums){
            System.out.print(x);
        }
    }
}