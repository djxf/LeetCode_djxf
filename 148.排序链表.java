/*
 * @lc app=leetcode.cn id=148 lang=java
 *
 * [148] 排序链表
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
    public ListNode sortList(ListNode head) {
        if(head == null && head.next == null){
            return head;
        }
        //切分链表
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
        }
        //保存后一段链表
        ListNode temp = slow.next;
        slow.next = null;

        //递归进行 空间复杂度不满足 常数空间
        ListNode left = sortList(head);
        ListNode right = sortList(temp);

        //合并节点
        ListNode tempHead = new ListNode(0);
        ListNode res = tempHead;
        while(left != null && right != null){
            if(left.val < right.val){
                tempHead.next = left;
                left = left.next;
            }else{
                tempHead.next = right;
                right = right.next;
            }
        }
        //检查最后是否两个链表还有节点未连接
        tempHead.next = left != null ? left : right;
        return res.next;
    }
}
// @lc code=end

