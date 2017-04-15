/**
 * Created by hyh on 2017/4/15.
 */
public class RemoveElements {
    public static ListNode removeElements(ListNode head, int val) {
        if(head == null )
            return null;
        ListNode pHead = head;
        ListNode pre = null;
        ListNode now = head;
        ListNode next = null;

        while(now != null){
            next = now.next;
            if(now.val == val){
                while( next != null && next.val == val)
                    next = next.next;
                if(pre == null) {
                    pHead = next;
                }
                else
                    pre.next = next;
                now = next;

            }
            else {
                pre = now;
                now = next;
            }
        }
        return pHead;
    }

    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = null;
        ListNode result = removeElements(node1,6);
        if(result == null)
            System.out.print("null");
        else
            System.out.print(result.val);
    }
}
