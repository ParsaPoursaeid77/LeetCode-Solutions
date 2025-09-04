// LeetCode Problem 1108: Defanging an IP Address
// Difficulty: Easy
// Language: Java
// Approach: Use StringBuilder to replace each '.' with "[.]"

class Solution {
    public String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder(); // to build the new string

        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                result.append("[.]"); // replace period with [.]
            } else {
                result.append(address.charAt(i));
            }
        }

        return result.toString();
    }
}
