class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> maxheap=new PriorityQueue<>((a,b)->mp.get(b)-mp.get(a));
        maxheap.addAll(mp.keySet());
        StringBuilder sb=new StringBuilder();
        while(!maxheap.isEmpty()){
            char x=maxheap.poll();
            int count=mp.get(x);
              for(int i=0;i<count;i++){
                sb.append(x);
              }
        }
      return sb.toString();
    }
}