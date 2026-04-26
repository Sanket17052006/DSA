// LC - 2130 : https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/

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
    public int pairSum(ListNode head) {
        int max=0;
        List<Integer> l=new ArrayList<>();
        ListNode temp=head;
        while(temp != null){
            l.add(temp.val);
            temp=temp.next;
        }
        int left=0,right=l.size()-1;
        while(left<right){
            int sum=l.get(left++)+l.get(right--);
            max=Math.max(max,sum);

        }
        return max;
    }
}