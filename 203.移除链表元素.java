/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
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
    public ListNode removeElements(ListNode head, int val) {
            ListNode result = new ListNode(-1);
            result.next = head;
            ListNode cur = head;
            ListNode pre = result;
            while(cur != null){
                if(cur.val == val){
                    pre.next = cur.next;
                }else{
                    pre = cur;
                }
                cur = cur.next;
            }
            return result.next;
    }
}
// @lc code=end

