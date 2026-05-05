class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        // 'i' is the index of the last known unique element
        int i = 0; 
        
        // 'j' scans through the rest of the array
        for (int j = 1; j < nums.length; j++) {
            // If we find a new unique value...
            if (nums[j] != nums[i]) {
                i++;           // Move the unique pointer forward
                nums[i] = nums[j]; // Update the array in-place
            }
        }
        
        // Return the count of unique elements (index + 1)
        return i + 1;
    }
}