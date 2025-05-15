// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/

// LeetCode -> 1047. Remove All Adjacent Duplicates In String

// You are given a string s consisting of lowercase English letters. 
// A duplicate removal consists of choosing two adjacent and equal 
// letters and removing them.

// We repeatedly make duplicate removals on s until we no longer can.

// Return the final string after all such duplicate removals 
// have been made. It can be proven that the answer is unique.

 

class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            int len = sb.length();
            if(len > 0 && (sb.charAt(len-1) == ch))
                sb.deleteCharAt(len-1);
            else
            sb.append(ch);
        }
        return sb.toString();
    }
}

// Slower cause Stack is legacy class -> synchronized Object -> Slower
/*
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<Character>();
        String str = "";
        for (char ch : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == ch)
                st.pop();
            else
                st.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
*/