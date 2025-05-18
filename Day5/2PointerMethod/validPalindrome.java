// LeetCode -> 125. Valid Palindrome

// https://leetcode.com/problems/valid-palindrome/


class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
        s1 = s1.toLowerCase();
        char[] s2 = s1.toCharArray();
        int length = s2.length;
        int left = 0;
        int right = length - 1;
        while(left < right){
            if(s2[left] != s2[right])
                return false;
            left++;
            right--;
        }
        return true;
        

    }
}