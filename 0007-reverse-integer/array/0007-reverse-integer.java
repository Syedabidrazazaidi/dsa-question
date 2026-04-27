class Solution {
    public int reverse(int x) {
        int ans=0;
        int n=Math.abs(x);
       
        
        while(n!=0){
            int r=n%10;
             if (ans > (Integer.MAX_VALUE - r) / 10) {
                return 0;  // Agar overflow hua, toh 0 return kardo
            }
             n=n/10;
            
            ans=ans*10+r;
            
        }
        return (x<0)?(-ans):ans;
    }
}
