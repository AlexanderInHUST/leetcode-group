package algorithms;

import base.ListNode;

/**
 * Created by tangyifeng on 17/1/26.
 * Email: yifengtang_hust@outlook.com
 */
public class ReverseLinkedList_206 {

    public ListNode reverseList(ListNode head) {
        if(head != null) {
            ListNode p = head.next;
            ListNode q = p;
            ListNode front = p;
            while (p.next != null) {
                p = p.next;
                q = p.next;
                p.next = head.next;
                front.next = q;
                head.next = p;
                p = front;
            }
        }
        return head;
    }
}
