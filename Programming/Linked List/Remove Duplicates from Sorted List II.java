/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
      
      ListNode dummy=new ListNode(0); //pseudo head
      dummy.next=A;
      ListNode prev=dummy;
      ListNode cur=A;
      
      while(cur != null){
          
          while(cur.next != null && prev.next.val==cur.next.val){
              cur=cur.next;
          }
          
          if(prev.next==cur){
              prev=prev.next;
          }
          else{
              
              prev.next=cur.next;
              cur=cur.next;
          }
      }
      A=dummy.next;
      return A;    
    }
}
