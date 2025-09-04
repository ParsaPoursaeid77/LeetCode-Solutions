// LeetCode Problem 1389: Create Target Array in the Given Order
// Difficulty: Easy
// Language: Java
// Approach: ArrayList insertion at given index

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> targetList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            targetList.add(index[i], nums[i]);
        }

        int[] result = new int[targetList.size()];
        for (int j = 0; j < targetList.size(); j++) {
            result[j] = targetList.get(j);
        }

        return result;
    }
}
