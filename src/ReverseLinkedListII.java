/**
 * Created by hyh on 2017/5/2.
 */
public class ReverseLinkedListII {
    public static ListNode reverseSomeListNode(ListNode head, int length) {
        if (length == 0)
            return head;
        ListNode pre = null;
        ListNode now = head;
        ListNode next = null;
        if (now.next == null)
            return head;
        int count = 0;
        while (now != null && count < length) {
            next = now.next;
            now.next = pre;
            pre = now;
            now = next;
            count++;
        }
        return pre;
    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || m > n)
            return null;
        ListNode pHead = head;
        int ListLen = 0;
        while (pHead != null) {
            ListLen++;
            pHead = pHead.next;
        }
        pHead = head;
        if (m > ListLen || n > ListLen)
            return null;
        int count = 1;
        int length = n - m + 1;
        ListNode pre = null;
        ListNode now = pHead;
        ListNode next = null;
        if (now.next != null)
            next = now.next;

        while (now != null && count < m) {
            pre = now;
            now = next;
            next = now.next;
            count++;
        }
        while (count<n){
            next = next.next;
            count++;
        }
        ListNode reverseHead = reverseSomeListNode(now, length);

        if (pre == null) {
            pHead = reverseHead;
            while (reverseHead.next != null) {
                reverseHead = reverseHead.next;
            }
            reverseHead.next = next;
        } else {
            pre.next = reverseHead;
            while (reverseHead.next != null) {
                reverseHead = reverseHead.next;
            }
            reverseHead.next = next;
        }
        return pHead;

    }

    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = null;

        ListNode  listNode = reverseBetween(node1,4,8);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
