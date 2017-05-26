/**
 * Created by hyh on 2017/5/26.
 */
public class ReverseList {
    public static ListNode reverseList(ListNode head){
        if(head == null)
            return null;
        ListNode pre = null;
        ListNode now = head;
        ListNode next = null;
        while(now!=null){
            next = now.next;
            now.next = pre;
            pre = now;
            now = next;
        }
        return pre;

    }
    public static boolean chkPalindrome(ListNode A) {
        // write code here
        if(A == null)
            return false;
        ListNode low = A;
        ListNode fast = A;
        if(A.next != null)
            fast = A.next;
        else
            return true;
        if(fast.next == null)
        {
            if(low.val == fast.val)
                return true;
            else
                return false;

        }
        fast = A;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            low = low.next;
        }
        ListNode middle = low;
        ListNode newHead  = null;
        int flag = 0;
        if(fast.next ==null)
            flag =1; // the sum of ListNode is odd
        newHead = reverseList(middle.next);
        middle.next = null;
        low = A;
        if(flag == 1){
            while(low != middle){
                if(low.val == newHead.val){
                    low = low.next;
                    newHead = newHead.next;
                }
                else
                    return false;
            }
            return true;
        }
        else{
            while(low!=null){
                if(low.val == newHead.val){
                    low = low.next;
                    newHead = newHead.next;
                }
                else
                    return false;
            }
            return true;
        }
        // return false; // never take place



    }
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        System.out.print(chkPalindrome(node1));
    }
}
