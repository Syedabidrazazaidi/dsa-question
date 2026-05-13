class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int j=0;
        int n=strs.length;
        while(j<strs[0].length()){
            if( strs[0].charAt(j)==strs[n-1].charAt(j)){j++;}
            else break;
        }   
        return j==0?"":strs[0].substring(0,j);
    }
}