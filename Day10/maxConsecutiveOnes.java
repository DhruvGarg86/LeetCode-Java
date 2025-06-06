// LeetCode -> 485. Max Consecutive Ones

// https://leetcode.com/problems/max-consecutive-ones/description/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxLen = 0; 
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1)
                count++;
            else
                count = 0; 
            maxLen = Math.max(maxLen, count);
        }
        return maxLen;
    }
}