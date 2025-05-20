// LeetCode -> 1732. Find the Highest Altitude

// https://leetcode.com/problems/find-the-highest-altitude/description/


class Solution {
    public int largestAltitude(int[] gain) {
        int curr = 0;
        int highestPoint = curr;
        for (int altGain : gain) {
            curr += altGain;
            highestPoint = Math.max(highestPoint, curr);
        }
        return highestPoint;
    }
}