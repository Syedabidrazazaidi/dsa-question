class Solution {
    public int findKthPositive(int[] arr, int k) {
        int seq = 1;
        int n = arr.length;
        
        // Loop continuously until we have found all k missing numbers
        while (k > 0) {
            // Binary search to see if 'seq' is in the array
            if (!pres(arr, seq, 0, n - 1)) {
                k--; // Found a missing number!
            }
            
            if (k == 0) {
                return seq; // Return immediately if k hits 0
            }
            
            seq++;
        }
        return seq;
    }

    public boolean pres(int arr[], int elem, int s, int l) {
        while (s <= l) {
            int m = s + (l - s) / 2;
            if (arr[m] == elem) return true;
            else if (arr[m] < elem) s = m + 1;
            else l = m - 1;
        }
        return false;
    }
}
