// LeetCode Problem 1672: Richest Customer Wealth
// Difficulty: Easy
// Language: Java
// Approach: Track max sum of each customer's bank account using nested loop

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }
}
