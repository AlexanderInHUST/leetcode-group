package algorithms;

/**
 * Created by tangyifeng on 17/1/9.
 * Email: yifengtang@uniquestudio.com
 */
public class DeleteNode_237 {

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {val = x;}
    }

    public void deleteNode(ListNode node) {
        ListNode nextOne = node.next;
        node.val = nextOne.val;
        node.next = nextOne.next;
    }

//   void deleteNode(struct ListNode* node) {
//      struct ListNode* next = node->next;
//      *node = *next;
//      free(next);
//    }

}
