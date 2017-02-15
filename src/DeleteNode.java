import java.util.ArrayList;
import java.util.List;

public class DeleteNode {

	public class ListNode {
		     int val;
		     ListNode next;
		     public ListNode(int x) { val = x; }
		  }
	public static void deleteNode(ListNode node){
		node.val = node.next.val;
		node.next = node.next.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
