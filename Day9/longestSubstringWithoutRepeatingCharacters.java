// LeetCode -> 3. Longest Substring Without Repeating Characters

// https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        int i = 0, j = 0, maxLen = 0;
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                maxLen = Math.max(maxLen, (j - i));
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxLen;
    }
}