// LeetCode Problem 217: Contains Duplicate
// Difficulty: Easy
// Language: C++
// Approach: Brute force (check all pairs with nested loops)

#include <unordered_set>
using namespace std;

class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        unordered_set<int> seen;   // keeps track of numbers we've seen
        for (int num : nums) {
            if (seen.count(num)) { // if num already in set, duplicate found
                return true;
            }
            seen.insert(num);      // otherwise, add it to the set
        }
        return false; // no duplicates
    }
};
