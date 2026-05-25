class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int n=prices.length;
        int prof=prices[0];
        for(int i=0;i<n;i++){
           prof=Math.min(prof,prices[i]);
           int ans=prices[i]-prof;
           max=Math.max(ans,max);
            
        }
        return max;
    }
}