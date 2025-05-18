// LeetCode -> 977. Squares of a Sorted Array

// https://leetcode.com/problems/squares-of-a-sorted-array/

// TC -> O(N)
// SC -> O(N)

class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] res = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[i] = nums[left] * nums[left];
                left++;
            } else {
                res[i] = nums[right] * nums[right];
                right--;
            }
        }
        return res;
    }
}

// TC -> O(N + NlogN)
// SC -> O(1)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[j] = nums[i] * nums[i];
            j++;
        }
        Arrays.sort(nums);
        return nums;
    }
}