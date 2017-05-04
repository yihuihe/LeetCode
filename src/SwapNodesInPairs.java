/**
 * Created by hyh on 2017/5/4.
 */
public class SwapNodesInPairs {
    public static ListNode swapPairs(ListNode head) {
        if(head == null)
            return null;
        ListNode pre = null;
        ListNode first = head;
        ListNode second = null;
        ListNode pHead = null;
        int flag = 0;
        if(head.next != null)
            second = head.next;
        else
            return head;
        while(first !=null && second !=null){
            first.next = second.next;
            second.next = first;
            pre = first;

            if(flag == 0){
                pHead = second;
                flag =1;
            }
            if(first.next !=null){
                if(first.next.next !=null){
                    first = first.next;
                    second = first.next;
                    pre.next = second;
                }
                else
                    return pHead;
            }
            else
                return pHead;
        }
        return pHead;
    }
    public  static void main(String[] args){
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

        ListNode temp = swapPairs(node1);
        while (temp!=null){
            System.out.println(temp.val);
            temp  =temp.next;
        }

    }
}
