class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        HashMap<Character,Character> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            if(mp.containsKey(s.charAt(i))){
                if(mp.get(s.charAt(i))!=t.charAt(i)){return false;}
            }else if(mp.containsValue(t.charAt(i))) return false;
           else mp.put(s.charAt(i),t.charAt(i));
        }
        return true;
    }
}