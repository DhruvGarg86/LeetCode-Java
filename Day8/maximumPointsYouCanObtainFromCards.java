// LeetCode -> 1423. Maximum Points You Can Obtain from Cards

// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left = 0, leftSum = 0, maxSum = 0;
        for (int i = 0; i < k ; i++)
            leftSum += cardPoints[i];
        maxSum = leftSum;
        int right = cardPoints.length - 1;
        int rightSum = 0;
        for (int i = k - 1; i >= 0; i--) {
            leftSum = leftSum - cardPoints[i];
            rightSum = rightSum + cardPoints[right];
            right--;
            maxSum = Math.max(maxSum, leftSum + rightSum);
        }
        return maxSum;
    }
}