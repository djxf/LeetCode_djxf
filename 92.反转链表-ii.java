/*
 * @lc app=leetcode.cn id=92 lang=java
 *
 * [92] 反转链表 II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
            if(head == null || m <= 0 || n <= 0){
                return head;
            }
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode preNode = dummy;
            for(int i = 1;i < m;i++){
                preNode = preNode.next;
            }
            head = preNode.next;
            for(int i = m;i < n;i++){
                ListNode nextNode = head.next;
                head.next = nextNode.next;
                nextNode.next = preNode.next;
                preNode.next = nextNode;
            }
            return dummy.next;
    }
   
}
// @lc code=end

