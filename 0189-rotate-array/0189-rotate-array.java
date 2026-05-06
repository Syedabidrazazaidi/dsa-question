class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int b[] = new int[n];

         // handle large k

        for (int i = 0; i < n; i++) {
            b[(i + k) % n] = nums[i];
        }

        // copy back to nums
        for (int i = 0; i < n; i++) {
            nums[i] = b[i];
        }
    }
}