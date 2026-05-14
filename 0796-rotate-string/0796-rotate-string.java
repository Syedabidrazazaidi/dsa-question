class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        if (n != goal.length()) return false;
        if (s.equals(goal)) return true;

        for (int k = 0; k < n; k++) {
            // Find a potential starting point
            if (goal.charAt(k) == s.charAt(0)) {
                boolean match = true;
                for (int i = 0; i < n; i++) {
                    if (goal.charAt((i + k) % n) != s.charAt(i)) {
                        match = false; // This specific k failed...
                        break;         // ...so stop checking this k
                    }
                }
                if (match) return true; // If we finished the loop without failing, it's a match!
            }
        }
        
        return false; // Only return false if NO value of k worked
    }
}