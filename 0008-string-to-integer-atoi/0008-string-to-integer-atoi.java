class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int n=s.length();
        if(n==0) return 0;
        int i=0;
       int ans=0;
       int sign=1;
       if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++; // Move past the sign
        }
        for(;i<n;i++){
            char c=s.charAt(i);
            if(c<'0' || c>'9'){break;}
            int digit=c-'0';
            if (ans > Integer.MAX_VALUE / 10 || 
               (ans == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans=ans*10+digit;

        }
        return ans*sign;
    }
}