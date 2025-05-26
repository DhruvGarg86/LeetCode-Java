// LeetCode -> 242. Valid Anagram

// https://leetcode.com/problems/valid-anagram/description/

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];

        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        for (char ch1 : t.toCharArray()) {
            count[ch1 - 'a']--;
        }
        for (int value : count) {
            if (value != 0)
                return false;
        }
        return true;
    }
}
