class Solution {
    public boolean isPalindrome(int x) {
        int y=x;
        int sum=0;
        if(x<0){return false;}
        else{
        
        while(x>0){
           int r=x%10;
           sum=sum*10+r;
           x=x/10;
        }
        }
         return(y==sum)? true:false;
    }
}