class Solution {
    public String reverseWords(String s) {
       s=s.trim();
        StringBuilder sb=new StringBuilder();
        int n=s.length()-1;
        int end=n+1;
        while(n>=0){
            // int l=end;
            if(s.charAt(n)==' '){sb.append(s.substring(n+1,end));
            sb.append(" ");
            while(n>=0 && s.charAt(n)==' '){
                n--;
            }
            end=n+1;
            }n--;
        }
        sb.append(s.substring(0,end));
        return sb.toString().trim();
    }
}