// LC - 61 : https://leetcode.com/problems/rotate-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null){
            return head;
        }
        ListNode t=head;
        int l=1;
        while(t.next != null){
            l++;
            t=t.next;
        }

        k=k%l;
        if(k==0) return head;
        t.next=head;
        ListNode prev=null;
        for(int i=0;i<l-k;i++){
            prev=head;
            head=head.next;
        }
        prev.next=null;
        return head;
    }
}