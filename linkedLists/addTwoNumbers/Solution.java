class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        int carry = 0;
        
        while(l1 != null || l2 !=null){ 
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = carry + x + y ;
            int rem = sum % 10;
            carry = sum / 10;
            curr.next = new ListNode(rem);
            
            curr = curr.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        if(carry > 0) {
            curr.next = new ListNode(carry);
        }


        return temp.next;
    }
}