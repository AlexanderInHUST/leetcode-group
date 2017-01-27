package base;

/**
 * Created by tangyifeng on 17/1/27.
 * Email: yifengtang_hust@outlook.com
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        ListNode p = this;
        StringBuilder stringBuilder = new StringBuilder();
        while(p.next != null) {
            p = p.next;
            stringBuilder.append(p.val);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}