/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0|| lists==null)
            return null;
        PriorityQueue<ListNode> q=new PriorityQueue<ListNode>(new Comparator<ListNode>(){
            
            public int compare(ListNode l1, ListNode l2){
                return l1.val-l2.val;     
            }
        });
        
        ListNode helper=new ListNode(0);
        ListNode p=helper;
        for(ListNode l: lists){
            if(l!=null)
                q.offer(l);
        }
        while(!q.isEmpty()){
            ListNode n=q.poll();
            p.next=n;
            p=p.next;
            if(n.next!=null){
                q.offer(n.next);
            }}
          return helper.next;  
    
}}