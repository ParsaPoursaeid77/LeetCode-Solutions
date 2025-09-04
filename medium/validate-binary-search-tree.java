// LeetCode Problem 98: Validate Binary Search Tree
// Difficulty: Medium
// Language: Java
// Approach: Recursion with Min/Max Bounds (DFS)

class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode node, long min, long max) {
        if (node == null) return true;

        if (node.val <= min || node.val >= max) return false;

        return validate(node.left, min, node.val) && 
               validate(node.right, node.val, max);
    }
}
