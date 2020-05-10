import java.util.Stack;

/*
 * @lc app=leetcode.cn id=445 lang=java
 *
 * [445] 两数相加 II
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        ListNode currNode = l1;
        while(currNode != null){
            s1.add(currNode.val);
            currNode = currNode.next;
        }
        ListNode currNode2 = l2;
        while(currNode2 != null){
            s2.add(currNode2.val);
            currNode2 = currNode2.next;
        }
        ListNode pirmyNode = new ListNode(-1);
        ListNode result = pirmyNode;
        int flag = 0;
        while(!s1.isEmpty() || !s2.isEmpty()){
            int value1 = 0;
            if(s1.size() != 0){
                value1 = s1.pop();
            }
            int value2 = 0;
            if(s2.size() != 0){
                value2 = s2.pop();
            }
            int num1 = (value1 + value2 + flag) % 10;
            pirmyNode.next = new ListNode(num1);
            pirmyNode = pirmyNode.next;
            flag = (value1 + value2 + flag) / 10;
        }
        if(flag != 0){
            pirmyNode.next = new ListNode(flag);
            pirmyNode = pirmyNode.next;
        }
        return resever(result.next);
    }

    //翻转链表
    public ListNode resever(ListNode head){
        if(head == null){
            return head;
        }
        ListNode curr = head;
        ListNode pre = null;
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nextNode;
        }
        return pre;
    }
}
// @lc code=end

