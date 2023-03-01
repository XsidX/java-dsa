public class RemoveMin {
    public ListNode remove (ListNode list) {
    // replace statement below with code you write..
    if(list == null){
        return null;
    }
    ListNode temp = new ListNode(0);
    temp.next = list;
    ListNode minNode = list;
    ListNode current = list.next;
    ListNode prev = temp;
    ListNode minPrev = temp;
    while(current != null){
        if(current.info < minNode.info){
            minNode = current;
            minPrev = prev;           
        }
        prev = current;
        current = current.next;
        

    }
    minPrev.next = minNode.next;


    return temp.next;
    }
}