import java.util.Arrays;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        
        int left = 1;
        int right = piles[piles.length - 1]; // Maximum pile size
        int result = right; // Track the best valid speed found
        
        while (left <= right) { // Fix: Loop based on right bound, not n
            int mid = left + (right - left) / 2; // Fix: Correct mid-point formula
            
            if (canEat(piles, mid, h)) {
                result = mid;     // mid is a valid speed, record it
                right = mid - 1;  // Try to find a smaller valid speed
            } else {
                left = mid + 1;   // mid is too slow, increase the lower bound
            }
        }
        return result; 
    }
    
    public boolean canEat(int[] piles, int k, int h) {
        long sum = 0; // Fix: Use long to prevent integer overflow
        for (int j = 0; j < piles.length; j++) {
            sum = sum + ((piles[j] + k - 1) / k);
        }
        return sum <= h;
    }
}