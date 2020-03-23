/*
 * @lc app=leetcode.cn id=147 lang=java
 *
 * [147] 对链表进行插入排序
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
    public ListNode insertionSortList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode dummpy = new ListNode(0);
        ListNode pre;
        dummpy.next = head;
        while(head != null && head.next != null){
            if(head.val <= head.next.val){
                head = head.next;
                continue;
            }
            //pre指针 每次从表头循环
            pre = dummpy;

            while(pre.next.val < head.next.val){
                pre = pre.next;
            }
            ListNode curr = head.next;
            head.next = curr.next;
            curr.next = pre.next;
            pre.next = curr;
        }
        return dummpy.next;
        
    }
}
// @lc code=end

