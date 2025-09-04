// LeetCode Problem 1929: Concatenation of Array
// Difficulty: Easy
// Language: Java
// Approach: Copy array twice into a new array of size 2n using index offset

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n]; // creates array of size 2n

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];         // first copy
            ans[i + n] = nums[i];     // second copy
        }

        return ans;
    }
}
