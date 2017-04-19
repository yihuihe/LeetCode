/**
 * Created by hyh on 2017/4/19.
 */
public class RotateList {
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null || k<0)
            return null;
        int len = 0;
        ListNode pHead = head;
        while(pHead!= null){
            len++;
            pHead = pHead.next;
        }
        if(k==0)
            return head;
        k = k % len ;
        if(k == 0)
            return head;
        ListNode oldHead = head;
        ListNode newHead = null;
        pHead = head;
        int start = len-k;
        int count =0;
        while(count<start-1){
            count++;
            pHead = pHead.next;
        }
        newHead = pHead.next;
        pHead.next = null;
        pHead = newHead;
        while(pHead.next!=null){
            pHead = pHead.next;
        }
        pHead.next = oldHead;
        return newHead;
    }
    public static void main(String[] args){
        ListNode node1= new ListNode(1);
        ListNode node2= new ListNode(2);
        ListNode node3= new ListNode(3);
        ListNode node4= new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        ListNode node11 = rotateRight(node1,3);
        while (node11 != null){
            System.out.print(node11.val);
            node11 = node11.next;
        }
       // System.out.print(rotateRight(node1,3).val);
    }
}
