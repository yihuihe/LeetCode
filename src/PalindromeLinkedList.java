/**
 * Created by hyh on 2017/4/15.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class PalindromeLinkedList {


    public static ListNode reverseList(ListNode rightHead){
        if(rightHead == null)
            return null;
        ListNode pre = null;
        ListNode now = rightHead;
        ListNode next = null;
        while(now != null){
            next = now.next;
            now.next = pre;
            pre = now;
            now = next;
        }
        return pre;
    }

    public static boolean isPalindrome(ListNode head) {
        if(head == null )
            return true;
        int length = 0;
        ListNode pHead = head;
        ListNode rightHead = null;
        while(pHead != null){
            length++;
            pHead = pHead.next;
        }
        pHead = head;
        int halfIndex =  length / 2;
        int count =0;
        while(pHead != null){
            if(count == halfIndex)
            {
                rightHead = reverseList(pHead);
                break;
            }
            else{
                count++;
                pHead = pHead.next;
            }
        }
        pHead = head;
        for(int i=1;i<= length/2;i++){
            if(pHead.val == rightHead.val){
                pHead = pHead.next;
                rightHead = rightHead.next;
            }
            else{
                return false;
            }

        }
        return true;
    }

    public static void  main(String[] args){
        ListNode node1= new  ListNode(1);
        ListNode node2= new  ListNode(2);
        ListNode node3= new  ListNode(3);
        ListNode node4= new  ListNode(2);
        ListNode node5= new  ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        System.out.print(isPalindrome(node1));
    }
}
