/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode A, int B) {
        ListNode cur=A;
        int len=1;
        while(cur.next!= null){
            len++;
            cur=cur.next;
        }
        
        int count=len-(B%len);
        cur.next=A;         //last element
        while(count-- >0){
            cur=cur.next;
        }
        ListNode first=cur.next;
        cur.next=null;
        return first;
    }
}
