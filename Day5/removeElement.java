// LeetCode -> 27. Remove Element

// https://leetcode.com/problems/remove-element/description/

class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int j =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                count++; j++;
            }

        }
        return count;
    }
}