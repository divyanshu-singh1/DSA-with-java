public class CloneListWithRandomPointer {
    /*
     * this is you code 
     * 
     * while solving problem check if this works
     */
    static Node clone(Node head){
        for(Node curr = head; curr != null ; curr = curr.next.next){
            Node clone = new Node(head.data);
            clone.next= curr.next;
            curr.next = clone;
        }
        Node res = head.next;
        for(Node curr = head ; curr != null;curr = curr.next){
            Node clone = curr.next;
            clone.random = curr.random.next;
            curr.next = clone.next;
            clone.next = curr.next.next;
            
        }

    }
    static Node cloneGFG(Node h1){
        Node curr = h1;
        while(curr != null){
            Node next = curr.next;
            curr.next = new Node(curr.data);
            curr.next.next = next;
            curr =next;
        }

        for(curr = h1; curr!= null ; curr =curr.next.next){
            curr.next.random = (curr.random == null ) ? null : (curr.random.next);
        }
        Node h2 = h1.next;
        Node clone = h2;
        for(curr = h1; curr != null;curr = curr.next.next){
            curr.next = curr.next.next;
            /*
             * gfg code was 
             * clone.next = clone.next ? clone.next.next : null;
             * below code is changes so if it doesnt work youknow what to do
             */
            clone.next = clone.next != null ? clone.next.next  : null;
            clone = clone.next;
        }
        return h2;

    }
    public static void main(String[] args) {
        
    }
}
