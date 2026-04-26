// LC - 234 : https://leetcode.com/problems/palindrome-linked-list/

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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        List<Integer> l=new ArrayList<>();
        while(temp != null){
            l.add(temp.val);
            temp=temp.next;
        }
        int left=0,right=l.size()-1;
        while(left<right){
            if(l.get(left++) != l.get(right--)){
                return false;
            }
        }
        return true;
        
    }
}