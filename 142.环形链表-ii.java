import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=142 lang=java
 *
 * [142] 环形链表 II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //时间空间击败百分比都太少。
        // if(head == null){
        //     return null;
        // }
        // ListNode node = head;
        // Set<ListNode> set = new HashSet<>();
        // while(node != null){
        //     if(set.contains(node)){
        //         return node;
        //     }else{
        //         set.add(node);
        //     }
        //     node = node.next;
        // }
        // return null;
        
        if(head == null){
            return null;
        }

        ListNode intersect = getIntersect(head);
        if(intersect == null){
            return null;
        }

        ListNode p1 = head;
        ListNode p2 = intersect;

        while(p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    
    }

     //得到第一个相遇节点
     public ListNode getIntersect(ListNode head) {
        ListNode fast = head;
        ListNode low = head;
        //顺序bu
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            low = low.next;
            if(fast == low){
                return low;
            }
        }
        return null;
    }

}
// @lc code=end

