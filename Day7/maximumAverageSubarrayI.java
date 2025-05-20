// LeetCode -> 643. Maximum Average Subarray I

// https://leetcode.com/problems/maximum-average-subarray-i/description/

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0;
        int r = k -1;
        double sum = 0;
        for(int i = l ; i <= r; i++){
            sum += nums[i];
        }
        double maxAvg = sum/k;
        while(r < nums.length - 1){
            sum -= nums[l];
            l++; r++;
            sum += nums[r];
            double avg = sum / k;
            maxAvg = Math.max(avg, maxAvg);
        }
        return maxAvg;
    }
}