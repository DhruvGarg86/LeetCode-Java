// LeetCode -> 1358. Number of Substrings Containing All Three Characters

// https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/

class Solution {
    public int numberOfSubstrings(String s) {
        int l = 0, count = 0;
        int[] arr = new int[3];
        for (int r = 0; r < s.length(); r++) {
            arr[s.charAt(r) - 'a']++;

            while (arr[0] > 0 && arr[1] > 0 && arr[2] > 0) {
                count += s.length() - r;
                arr[s.charAt(l) - 'a']--;
                l++;
            }
        }
        return count;
    }
}