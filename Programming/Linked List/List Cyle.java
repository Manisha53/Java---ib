/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode a) {
        ListNode quick=a;
        ListNode slow=a;
        while(quick != null && quick.next != null){
            slow=slow.next;
            quick=quick.next.next;
            
            if(quick==slow){
            //return slow;
            break;
        }
        }
        
        
        if(quick==null || quick.next==null) return null;
        slow=a;
        while(slow!=quick){
            slow=slow.next;
            quick=quick.next;
        }
        
        return slow;
    }
}
