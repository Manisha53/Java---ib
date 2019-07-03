
SOLUTION 1 : ITERARTIVE

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode head=new ListNode(0);
        ListNode cur=head;
        while(A != null && B != null){
            if(A.val > B.val){
                cur.next= new ListNode(B.val);
                B=B.next;
            }
            else{
                cur.next=new ListNode(A.val);
                A=A.next;
            }
            
            cur=cur.next;
        }
        
        while(A != null){
            cur.next=new ListNode(A.val);
            A=A.next;
            cur=cur.next;
        }
        
        while(B != null){
            cur.next=new ListNode(B.val);
            B=B.next;
            cur=cur.next;
        }
        
       return head.next; 
    }
}

SOLUTION 2  :USING RECURSION

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        if(A==null){
            return B;
        }
        if(B==null){
            return A;
        }
        if(A.val<B.val){
            A.next=mergeTwoLists(A.next,B);
            return A;
        }
        else{
            B.next=mergeTwoLists(A,B.next);
            return B;
        }
    }
}

