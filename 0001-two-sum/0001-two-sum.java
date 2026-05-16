class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            
            // Look for the complement, not the target itself
            if (mp.containsKey(comp)) {
                return new int[]{mp.get(comp), i}; 
            }
            
            mp.put(nums[i], i);
        }
        
        // Return an empty array or throw an exception if no solution exists
        return new int[]{-1, -1};
    }
}