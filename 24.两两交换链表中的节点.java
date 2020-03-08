/*
 * @lc app=leetcode.cn id=24 lang=java
 *
 * [24] 两两交换链表中的节点
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
    public ListNode swapPairs(ListNode head) {
            //递归三步区
            //1 递归终止条件
            //2 递归返回给上一层的值
            //3 考虑具体一步怎么做
            // if(head == null || head.next == null){
            //     return head;
            // }
            // ListNode next = head.next;
            // head.next = swapPairs(next.next);
            // next.next = head;
            // return next;


            //不用递归考虑迭代
            ListNode dummy = new ListNode(-1);  //用来保存头节点
            dummy.next = head;

            ListNode preNode = dummy;           //用来方便交换
            while(head != null && head.next != null){
                ListNode firstNode = head;
                ListNode secondNode = head.next;

                //交换
                preNode.next = secondNode;
                firstNode.next = secondNode.next;
                secondNode.next = firstNode;

                //继续下一步
                preNode = firstNode;
                head = firstNode.next;

            }
            return dummy.next;

    }
}
// @lc code=end

