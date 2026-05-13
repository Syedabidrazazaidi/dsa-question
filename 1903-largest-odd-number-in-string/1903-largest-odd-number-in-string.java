class Solution {
    public String largestOddNumber(String num) {
        int max=Integer.MIN_VALUE;
        StringBuilder sb=new StringBuilder();
        int n=num.length();
         for(int i=n;i>0;i--){
            if((int)num.charAt(i-1)%2!=0){sb.append(num.substring(0,i));
            break;}
         }
         return sb.toString();
    }
}