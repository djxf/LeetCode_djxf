/*
 * @lc app=leetcode.cn id=147 lang=java
 *
 * [147] 对链表进行插入排序
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
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        //用一个变量记录当前要进行插入排序的节点node
        //把node节点的值反向进行迭代比较。直到找到一个比它小的值时停止。插入到该值
        //的后面
        //直到迭代链表完毕
        //使用多个变量记录要素节点

        //创建一个h节点指向头节点
        ListNode h = new ListNode(-1);
        h.next = head;
        ListNode pre = h;


        ListNode cru = head;
        ListNode late;//记录下一个要插入排序的值
        while(cru != null){
            late = cru.next;
            if(late != null && late.val < cru.val){
                



                

            }

            
        }
        

    }
}
// @lc code=end

