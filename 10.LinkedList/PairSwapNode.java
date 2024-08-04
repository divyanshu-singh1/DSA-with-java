public class PairSwapNode {
    static Node swap(Node head){
        Node dummy = new Node(-1);
        dummy.next = head;
        Node curr = dummy;

        while(curr.next != null && curr.next.next != null){
            Node temp = curr.next.next ;
            curr.next.next = temp.next;
            temp.next = curr.next;
            curr.next = temp;
            if(dummy.next == head){
                dummy.next = temp;
            }
            curr =curr.next.next;
        }
        return dummy.next;
    }
    static Node pairSwap(Node head){
        if(head == null || head.next == null)
            return head;
        
        Node curr = head.next.next;
        Node prev = head;
        head = head.next;
        head.next = prev;
        while(curr != null && curr.next != null){
            prev.next = curr.next;
            prev = curr;
            Node next = curr.next.next;
            curr.next.next = curr;
            curr = next;
        }
        prev.next = curr;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        head = pairSwap(head);
        Node.display(head);
    }
}
