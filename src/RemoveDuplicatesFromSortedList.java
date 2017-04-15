/**
 * Created by hyh on 2017/4/15.
 */
public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        ListNode pHead = head;
        ListNode now = head;
        ListNode next = null;
        int val = 0;
        while(now != null){
            next= now.next;
            val = now.val;
            while(next != null && next.val == val)
                next = next.next;
            now.next = next;
            now = next;
        }
        return pHead;
    }
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = null;
        ListNode result = deleteDuplicates(node1);
        if(result == null)
            System.out.print("null");
        else
            System.out.print(result.val);
    }
}
