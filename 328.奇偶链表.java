/*
 * @lc app=leetcode.cn id=328 lang=java
 *
 * [328] 奇偶链表
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
    public ListNode oddEvenList(ListNode head) {


        //设置指针节点来遍历链表进行子链表的创建
        //设置指针节点来保存头节点
        //利用boolean取反交替进行

        //奇数节点
        ListNode oddHead = new ListNode(-1);
        //偶数节点
        ListNode evenHead = new ListNode(-1);
        ListNode odd = oddHead;
        ListNode even = evenHead;
        ListNode cur = head;
        boolean isOdd = true;
        while(cur != null){
            if(isOdd){
                odd.next = cur;
                odd = cur;
            }else{
                even.next = cur;
                even = cur;
            }
            isOdd = !isOdd;
            cur = cur.next;
        }
        odd.next = evenHead.next;
        even.next = null;
        return oddHead.next;
    }
}
// @lc code=end

