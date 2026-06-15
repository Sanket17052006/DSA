// LC - 2095 : https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/

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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;
        int c=0;
        ListNode temp1=head;
        while(temp1 != null){
            c++;
            temp1=temp1.next;
        }
        ListNode temp=head;
        int step = (c/2) - 1;
        while(step > 0){
            temp=temp.next;
            step--;
        }
        temp.next = temp.next.next;
        return head;
    }
}