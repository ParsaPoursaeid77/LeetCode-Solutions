// LeetCode Problem 167: Two Sum II - Input Array Is Sorted
// Difficulty: Medium
// Language: C++
// Approach: Two pointers (left and right)

#include <vector>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        int left = 0, right = numbers.size() - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                // +1 because problem wants 1-indexed
                return {left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return {}; // should never hit, since problem guarantees a solution
    }
};
