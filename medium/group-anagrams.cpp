// LeetCode Problem 49: Group Anagrams
// Difficulty: Medium
// Language: C++
// Approach: Use unordered_map with sorted string as key

#include <unordered_map>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> mp;

        for (string s : strs) {
            string key = s;
            sort(key.begin(), key.end());  // sorted form = key
            mp[key].push_back(s);
        }

        vector<vector<string>> result;
        for (auto& entry : mp) {
            result.push_back(entry.second);
        }

        return result;
    }
};
