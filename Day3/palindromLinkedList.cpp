// LeetCode -> 234. Palindrome Linked List

// https://leetcode.com/problems/palindrome-linked-list/description/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = reverseList(slow.next);
        slow = slow.next;
        while(slow != null){
            if(slow.val != head.val)
                return false;
            slow= slow.next;
            head = head.next;
        }
        return true;
    }

    public ListNode reverseList(ListNode slow) {
        ListNode t1 = null;
        ListNode t2 = slow;
        ListNode t3;
        while (t2 != null) {
            t3 = t2.next;
            t2.next = t1;
            t1 = t2;
            t2 = t3;
        }
        return t1;
    }
}