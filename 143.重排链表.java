/*
 * @lc app=leetcode.cn id=143 lang=java
 *
 * [143] 重排链表
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
    public void reorderList(ListNode head) {
      
        if(head == null || head.next == null || head.next.next == null){
            return ;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = null;
        while(fast != null && fast.next != null){
            pre = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        pre.next = null;

        //反转[slow,fast]
        ListNode preNode = null;
        ListNode curNode = slow;
        while(curNode != null){
            ListNode nextNode = curNode.next;
            curNode.next = preNode;
            preNode = curNode;
            curNode = nextNode;
        }

        //合并链表
        ListNode header = new ListNode(1);
        ListNode list = header;

        while(head != null && preNode != null){
            list.next = head;
            head = head.next;

            list.next.next = preNode;
            preNode = preNode.next;

            list = list.next.next;
        }

        //对链表分断后preNode 的节点谁多
        if(preNode != null){
            list.next  = preNode;
        }
        head = header.next;
        
        //打印测试
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }

    }
}
// @lc code=end

