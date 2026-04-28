class Solution {
    public boolean isPalindrome(String a) {
        a=a.trim();
        a=a.toLowerCase();
        a=a.replaceAll("[^sa-zA-Z0-9]","");
         int s=0;int l=a.length()-1;
        while(s<=l){
            if(a.charAt(s)!=a.charAt(l)){
                return  false;
            }
            s++;
            l--;
        }
        return true;
    }
}