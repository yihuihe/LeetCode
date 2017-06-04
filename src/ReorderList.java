/**
 * Created by hyh on 2017/5/4.
 */
public class ReorderList {
    public static ListNode reverseList(ListNode phead){
        if(phead == null)
            return null;
        ListNode pre = null;
        ListNode now = phead;
        ListNode next = null;
        while(now!=null){
            next = now.next;
            now.next = pre;
            pre = now;
            now = next;
        }
        return pre;
    }
    public static void reorderList(ListNode head) {
        if(head == null)
            return ;
        ListNode low = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            low = low.next;
        }
        if(fast==low)
            return ;
        ListNode middle = low;

        low = head;
        ListNode secondHead = reverseList(middle.next);
        middle.next = null;
        ListNode low_temp = null;
        ListNode secondHead_temp = null;
        while(low!=null && secondHead!=null){
            low_temp = low.next;
            secondHead_temp = secondHead.next;
            low.next = secondHead;
            low = low_temp;
            secondHead.next = low;
            secondHead = secondHead_temp;
        }

    }


//    public static void reorderList(ListNode head) {
//        if(head == null)
//            return ;
//        ListNode pHead1 = head;
//        ListNode pHead2 = head;
//        while(pHead2.next != null && pHead2.next.next != null){
//            pHead1 = pHead1.next;
//            pHead2 = pHead2.next.next;
//        }
//
//        ListNode midNode = pHead1;
//        pHead2 = midNode.next;
//        ListNode preNode = null;
//        ListNode next = null;
//        while(pHead2 != null){
//            next = pHead2.next;
//            pHead2.next = preNode;
//            preNode = pHead2;
//            pHead2 = next;
//        }
//        midNode.next = preNode;
//
//        pHead1 = head;
//        pHead2 = midNode.next;
//        while(pHead1 != midNode){
//            midNode.next = pHead2.next;
//            pHead2.next = pHead1.next;
//            pHead1.next = pHead2;
//            pHead1 = pHead2.next;
//            pHead2 = midNode.next;
//        }
//
//    }
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

        reorderList(node1);
        while (node1!=null){
            System.out.println(node1.val);
            node1 = node1.next;
        }
    }
}
