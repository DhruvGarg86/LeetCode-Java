// LeetCode -> 1248. Count Number of Nice Subarrays

// https://leetcode.com/problems/count-number-of-nice-subarrays/

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return most(nums, k) - most(nums, k - 1);
    }

    private int most(int[] nums, int k) {
        if (k < 0)
            return 0;
        int l = 0, r = 0, sum = 0, count = 0;
        while (r < nums.length) {
            sum += (nums[r] % 2);
            while (sum > k) {
                sum = sum - (nums[l] % 2);
                l++;
            }
            count = count + (r - l + 1);
            r++;
        }
        return count;
    }
}