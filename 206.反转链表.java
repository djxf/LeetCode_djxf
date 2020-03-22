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
               //保存下一个指针
                ListNode nextNode = curNode.next;
                //将当前的指针指向前一个结点
                curNode.next = preNode;
                preNode = curNode;
                curNode = nextNode;
           }
           return preNode;
    }


    //递归
    public ListNode reverseList0(ListNode head){
        //递归终止条件
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

