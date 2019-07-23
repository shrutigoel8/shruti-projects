/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode revers(ListNode pre, ListNode next){
        
        ListNode last=pre.next;
        ListNode curr=last.next;
        
        while(curr!=next){
            last.next=curr.next;
            curr.next=pre.next;
            pre.next=curr;
            curr=last.next;
            
        }
        
        return last;
        
        
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1)
            return head;
        ListNode helper=new ListNode(0);
        helper.next=head;
        ListNode pre=helper;
        ListNode p=head;
        int i=0;
        while(p!=null){
            i++;
            if(i%k==0)
              { pre= revers(pre, p.next);
                p=pre.next;}
            else
                p=p.next;}
        return helper.next;
    }
}