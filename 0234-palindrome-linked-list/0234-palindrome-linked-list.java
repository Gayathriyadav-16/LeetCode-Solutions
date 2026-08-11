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
        // Stack<Integer> st = new Stack<>();
        // ListNode temp = head;
        // while(temp != null){
        //     st.push(temp.val);
        //     temp = temp.next;
        // }
        // temp = head;
        // while(!st.isEmpty()){                 //or while(temp != null){
        //     if(temp.val != st.peek()){        //    if(temp.val != st.pop()){ 
        //         return false;                 //        return false;
        //     }                                 //     }
        //     temp = temp.next;                 //     temp = temp.next;
        //     st.pop();                         // }
        // }
        // return true;
        if(head == null || head.next == null)
        {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }    
        ListNode secondhalf = reverse(slow);
        ListNode firsthalf = head;
        while(secondhalf != null){
            if(firsthalf.val != secondhalf.val){
                return false;
            }
            firsthalf = firsthalf.next;
            secondhalf = secondhalf.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode temp = head;
        while(temp!=null){
            ListNode next = temp.next;
            temp.next =  prev;
            prev = temp;
            temp = next;
        }
        head = prev;
        return head;
    }
}