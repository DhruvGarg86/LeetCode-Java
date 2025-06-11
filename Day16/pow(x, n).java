// LeetCode -> 50. Pow(x, n)

// https://leetcode.com/problems/powx-n/

class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long n1 = n;
        if (n1 < 0) {
            n1 = -n1;
            x = 1 / x;
        }
        while (n1 > 0) {
            if (n1 % 2 == 1) {
                ans *= x;
            }
            x *= x;
            n1 /= 2;
        }
        return ans;
    }
}
