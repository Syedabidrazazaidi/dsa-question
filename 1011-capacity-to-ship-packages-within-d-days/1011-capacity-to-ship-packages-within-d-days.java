class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low =1,high=0;
        //  int n=weights.length;
        for(int x:weights){
            low=Math.max(x,low);
            high+=x;
        }
        int ans=high;
        while(low<=high){
           int mid=low+(high-low)/2;
             if(possible(mid,weights,days)){
                 ans= mid;
                 high=mid-1;
            }else low=mid+1;
             
             
        }
        
        return ans;
     
    }
    public boolean possible(int cap,int nums[],int d){
        int count =1;
        int n=nums.length;
        int sum=nums[0];
        for(int i=1;i<n;i++){
          
            if(sum+nums[i]>cap){count++;sum=nums[i];}
            else{sum+=nums[i];}
        }
        
       return count<=d; 
    }
}