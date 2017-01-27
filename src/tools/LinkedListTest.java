package tools;

import algorithms.ReverseLinkedList_206;
import base.ListNode;

/**
 * Created by tangyifeng on 17/1/27.
 * Email: yifengtang_hust@outlook.com
 */
public class LinkedListTest {

    public static void main(String[] args) {
        ListNode head = new LinkedListTest().getList(new int[]{2, 1});
        new ReverseLinkedList_206().reverseList(head);
        System.out.println(head);
    }

    public ListNode getList(int nums[]) {
        ListNode head = new ListNode(-1);
        ListNode p = head;
        for(int i : nums) {
            ListNode q = new ListNode(i);
            p.next = q;
            p = q;
        }
        return head;
    }
}
