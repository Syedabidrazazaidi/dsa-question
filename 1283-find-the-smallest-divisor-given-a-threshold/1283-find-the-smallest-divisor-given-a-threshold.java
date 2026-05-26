class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        // Find the maximum element in the array to set our upper bound
        int low = 1;
        int high = 0;
        for (int num : nums) {
            high = Math.max(high, num);
        }
        
        int ans = high;
        
        // Binary search for the smallest valid divisor
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (getSum(nums, mid) <= threshold) {
                ans = mid;       // 'mid' is a valid divisor, record it
                high = mid - 1;  // Try to find a smaller valid divisor on the left
            } else {
                low = mid + 1;   // Sum is too large, we need a bigger divisor
            }
        }
        
        return ans;
    }
    
    // Helper method to calculate the sum of elements divided by 'divisor' (rounded up)
    private int getSum(int[] nums, int divisor) {
        int sum = 0;
        for (int num : nums) {
            // Sweet math trick to perform integer division ceiling: (a + b - 1) / b
            sum += (num + divisor - 1) / divisor;
        }
        return sum;
    }
}