/**
 * Created by hyh on 2017/5/4.
 */
public class ReverseNodesInk_Group {
    public static ListNode reverseKGroup(ListNode head, int k) {
        if(head == null )
            return null;
        int count = 0;
        ListNode pHead = head;
        ListNode now = head;
        while(pHead !=null && count<k){
            pHead = pHead.next;
            count++;
        }
        ListNode next = null;
        if(count == k){
            pHead = reverseKGroup(pHead,k);
            while(count>0){
                count--;
                next = now.next;
                now.next = pHead;
                pHead = now;
                now = next;
            }
            return pHead;
        }
        return now;

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

        ListNode temp = reverseKGroup(node1,6);
        while (temp!=null){
            System.out.println(temp.val);
            temp  =temp.next;
        }
    }
}
