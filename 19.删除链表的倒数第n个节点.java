/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第N个节点
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        ListNode node = new ListNode(-1);
        node.next = head;
        
        ListNode first = head;
        //扫描一趟记录链表长度n
        int len = 0;
        while(first != null){
            len++;
            first = first.next;
        }
        int k = len - n + 1;
        //first 和 node指向堆内存的同一个对象。
        first = node;

        while(k != 1){
            k--;
            first = first.next;
        }
        first.next = first.next.next;
        return node.next;
    }
}
// @lc code=end

