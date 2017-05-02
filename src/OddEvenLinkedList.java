/**
 * Created by hyh on 2017/5/1.
 */
class ListNode{
    int val;
    ListNode next;
    ListNode (int x ){
        val = x;
    }
}
public class OddEvenLinkedList {
    public  static ListNode oddEvenList(ListNode head) {
        if(head == null)
            return null;
        ListNode head1 = head;
        ListNode head2 = null;
        if(head.next == null)
            return head;
        else
            head2 = head.next;
        ListNode now1 = head1;
        ListNode now2 = head2;
        ListNode temp = null;
        while(now1.next != null && now2.next != null){
            if(now1.next.next!=null){
                temp = now1.next.next;
                now1.next = now1.next.next;
                now1 = temp;
            }
            if(now2.next.next!=null){
                temp = now2.next.next;
                now2.next = now2.next.next;
                now2 = temp;
            }
        }
        now1.next = head2;
        now2.next = null;
        return head1;



    }
    public  static  void main(String[] args){
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


        ListNode node = oddEvenList(node1);
        while (node != null){
            System.out.println(node.val);
            node = node.next;
        }


    }
}
