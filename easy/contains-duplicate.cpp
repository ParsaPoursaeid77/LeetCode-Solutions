// LeetCode Problem 217: Contains Duplicate
// Difficulty: Easy
// Language: C++
// Approach: Brute force (check all pairs with nested loops)

class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        for (size_t i = 0; i + 1 < nums.size(); ++i) {
            for (size_t j = i + 1; j < nums.size(); ++j) {
                if (nums[i] == nums[j]) return true;
            }
        }
        return false;
    }
};
