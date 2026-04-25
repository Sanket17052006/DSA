// LC - 203 : https://leetcode.com/problems/remove-linked-list-elements/

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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        while(head.val==val){
            head=head.next;
            if(head==null) return head;
        }


        ListNode temp=head,prev=null;

        while(temp != null){
            if(temp.val ==val){
                if(prev==null) prev=temp.next;
                else prev.next=temp.next;
                temp=temp.next;
            }
            else{
                prev=temp;
                temp=temp.next;
            }
        }
        return head;
    }
}