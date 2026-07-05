class Solution {
    public double myPow(double x, int N) {
        long n=N;

        if(n<0){
            x=1/x;
            n=-n;
            pow(x,n);
        }return pow(x,n);
    }
    public double pow(double x,long n){
       
       if(n==0) return 1.0 ;
      double ans=pow(x,n/2);
      if(n%2==0){ return ans*ans;}
      else{ return ans*ans*x;}
       
    }
}