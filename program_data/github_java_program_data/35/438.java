/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }

Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?

use fast runner slow runner ,if fast runner catches up with slow runner , there is a cycle


 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
        	fast=fast.next.next;
        	slow=slow.next;
        	if(fast!=slow)
        		continue;
        	return true;
        }
        return false;
        
    }
}