/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
 * 
 * 
 * 常用操作的组合拳
 * 
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
    public boolean isPalindrome(ListNode head) {

        if(head == null) return true;

        ListNode middleNode = findMiddleNode(head);
        ListNode secondHalfNode = reverseList(middleNode.next);
        
        ListNode p1 = head;
        ListNode p2 = secondHalfNode;
        while(p1 != null && p2 != null){
            if(p1.val != p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;

    }

    //倒转链表
    public ListNode reverseList(ListNode head){

        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode tempNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempNode;
        }
        return prev;
    }

    //寻找链表最中间的节点
    //若链表长度为奇数 则为最中间的节点
    public ListNode findMiddleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
// @lc code=end

