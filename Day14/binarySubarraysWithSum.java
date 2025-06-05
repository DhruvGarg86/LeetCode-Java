// LeetCode -> 930. Binary Subarrays With Sum

// https://leetcode.com/problems/binary-subarrays-with-sum/

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return countAtMost(nums, goal) - countAtMost(nums, goal - 1);
    }

    public int countAtMost(int[] nums, int goal) {
        if (goal < 0)
            return 0;
        int l = 0, r = 0, sum = 0, count = 0;
        while (r < nums.length) {
            sum += nums[r];
            while (sum > goal) {
                sum = sum - nums[l];
                l++;
            }
            count = count + (r - l + 1);
            r++;
        }
        return count;
    }

}