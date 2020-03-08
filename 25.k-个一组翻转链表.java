/*
 * @lc app=leetcode.cn id=25 lang=java
 *
 * [25] K 个一组翻转链表
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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode end = dummy;

        while(){
            //进行k次循环
            for(int i = 0;i < k && end != null;i++){
                end = end.next;
            }
            

        }



    }


    public ListNode reverseListNode(ListNode head){

        //初始状态前节点指针为null
        ListNode preNode = null;
        //当前节点为head
        ListNode currNode = head;
        
        while(currNode != null){
            //保存下一个节点 以免丢失
            ListNode nextNode = currNode.next;
            //将当前节点的指针指向之前的 
            currNode.next = preNode;
            //迭代下一步
            preNode = currNode;
            currNode = nextNode;
        }
        return preNode;
    }



    }
}



// @lc code=end

