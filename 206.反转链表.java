/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
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
    public ListNode reverseList(ListNode head) {
        ListNode preNode = null;
        ListNode curNode = head;
     
        while(curNode != null){
            ListNode nextNode = curNode.next;

            //把当前节点的指向前一个节点
            curNode.next = preNode;

            //把当前节点的变为前一个节点。
            preNode = curNode;

            //当前节点指针移动到下一个节点
            curNode = nextNode;
        }
        return preNode;
    }


    //递归
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }



}
// @lc code=end

