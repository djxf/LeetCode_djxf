/*
 * @lc app=leetcode.cn id=61 lang=java
 *
 * [61] 旋转链表
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
    public ListNode rotateRight(ListNode head, int k) {
            ListNode kfNode = findKListNode(head, getLinkLength(head)-1);
            ListNode kNode = findKListNode(head, getLinkLength(head));
            return mergeTwoLink(kfNode, kNode);
    }

    // //将链表的末尾插到头部
    // public ListNode tailToHead(ListNode head){
    //     if(head == null || head.next == null) return head;
    //     ListNode frontNode = head;
    //     ListNode afterNode = head.next;
    //     while(afterNode.next != null){
    //         frontNode = frontNode.next;
    //         afterNode = afterNode.next;
    //     }
    //     afterNode.next = head;
    //     frontNode = null;
    //     return afterNode;
    // }

    //寻找链表的第k个节点
    public ListNode findKListNode(ListNode head,int k){
            if(head == null || k < 0){
                return null;
            }
            while((--k) == 1){
                head = head.next;
            }
            return head;
    }
    
    //将一个链表合并到另一个链表的末尾
    public ListNode mergeTwoLink(ListNode head1,ListNode head2){
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }
        if(head1 == null && head2 == null){
            return null;
        }
        ListNode firstNode = head1;
        while(firstNode.next != null){
            firstNode = firstNode.next;
        }
        firstNode.next = head2;
        return head1;

    }

    //返回链表的长度
    public int getLinkLength(ListNode head){
        int result = 0;
        while(head != null){
            result++;
            head = head.next;
        }
        return result;
    }

}
// @lc code=end

