import java.util.Arrays;

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        // 1. Prevent integer overflow and handle impossible case
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        // 2. Define the search range for the binary search (min and max days)
        int start = 1;
        int end = 0;
        for (int day : bloomDay) {
            end = Math.max(end, day);
        }

        int ans = -1;

        // 3. Binary search for the minimum viable day
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (canMakeBouquets(bloomDay, m, k, mid)) {
                ans = mid;       // 'mid' is feasible, record it
                end = mid - 1;   // Try to find a smaller number of days
            } else {
                start = mid + 1; // 'mid' is too small, we need more days
            }
        }

        return ans;
    }

    // Helper method to check if we can form 'm' bouquets of size 'k' within 'mid' days
    private boolean canMakeBouquets(int[] bloomDay, int m, int k, int mid) {
        int bouquets = 0;
        int flowers = 0;

        for (int day : bloomDay) {
            if (day <= mid) {
                flowers++; // This flower has bloomed by 'mid' day
                if (flowers == k) {
                    bouquets++;    // We formed a bouquet!
                    flowers = 0;   // Reset count for the next adjacent group
                }
            } else {
                flowers = 0; // The continuous chain of bloomed flowers is broken
            }
        }

        return bouquets >= m;
    }
}