import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * @lc app=leetcode.cn id=23 lang=java
 *
 * [23] 合并K个排序链表
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
    public ListNode mergeKLists(ListNode[] lists) {
        //    List<Integer> list = new ArrayList<>();
        //    for(int i = 0;i < lists.length;i++){
        //        ListNode node = lists[i];
        //        while(node != null){
        //            list.add(node.val);
        //            node = node.next;
        //        }
        //    }
        //    Collections.sort(list);
        //    ListNode  resultNode = new ListNode(-1);
        //    ListNode first = resultNode;
        //    for (Integer integer : list) {
        //        ListNode nextNode = new ListNode((int)integer);
        //        first.next = nextNode;
        //        first = nextNode;
        //    }
        //    return resultNode.next;

        //二分加递归 不知道有什么用
        
        // if(lists == null || lists.length ==0){
        //     return null;
        // }
        // return merge(lists, 0, lists.length - 1);



        //两两合并
        ListNode  resultNode = new ListNode(Integer.MIN_VALUE);
        for(ListNode node : lists){
            resultNode = mergeTwoLists(resultNode, node);
        }
        return resultNode.next;

    }
        

        //融合两个链表
        private ListNode mergeTwoLists(ListNode l1,ListNode l2){
            if(l1 == null) return l2;
            if(l2 == null) return l1;
            if(l1.val < l2.val){
                l1.next = mergeTwoLists(l1.next,l2);
                return l1;
            }else{
                l2.next = mergeTwoLists(l1,l2.next);
                return l2;
            }
        }

        //
        public ListNode merge(ListNode[] lists,int left,int right){
            if(left == right){
                return lists[left];
            }
            int mid = left + (right - left)/2;
            ListNode l1 = merge(lists,left,mid);
            ListNode l2 = merge(lists,mid+1,right);
            return mergeTwoLists(l1,l2);
        }


    }

// @lc code=end

