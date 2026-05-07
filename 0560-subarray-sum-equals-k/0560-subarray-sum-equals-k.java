class Solution {
    public int subarraySum(int[] nums, int k) {
         int n=nums.length;
      HashMap<Integer,Integer> mp=new HashMap<>();
      int count=0,sum=0;
      mp.put(0,1);
      for(int x:nums){
        sum+=x;
        if(mp.containsKey(sum-k)){
            count+=mp.get(sum-k);
        }
        mp.put(sum,mp.getOrDefault(sum,0)+1);

      }
      return count;
    }
}