public class SegregateEvenOdd {
    static Node segregate(Node head){
        Node dummyEven = new Node(-1);
        Node evenTail = dummyEven;
        Node dummyOdd = new Node(-1);
        Node oddTail = dummyOdd;

        Node curr = head;
        while(curr != null){
            if(curr.data % 2 == 0){
                evenTail.next = curr;
                evenTail = curr;
            }else{
                oddTail.next = curr;
                oddTail = curr;
            }
            curr = curr.next;
        }
        if(dummyEven.next == null)
            return dummyOdd.next;
        if(dummyOdd.next == null)
            return dummyEven.next;

        evenTail.next = dummyOdd.next;
        oddTail.next = null;
        return dummyEven.next;
    }

    static Node segregateGFG(Node head){
        Node evenStart = null , evenEnd = null , oddStart = null , oddEnd = null;

        for(Node curr = head; curr != null ; curr = curr.next){
            int x = curr.data;
            if(x%2 == 0){
                if(evenStart == null){
                    evenStart = evenEnd = curr;
                }else{
                    evenEnd.next = curr;
                    evenEnd = evenEnd.next;
                }
            }else{
                if(oddStart == null){
                    oddStart = oddEnd = curr;
                }else{
                    oddEnd.next = curr;
                    oddEnd = oddEnd.next;
                }
            }
        }
        if(oddStart == null || evenStart == null)
            return head;
        
        evenEnd.next = oddStart;
        oddEnd.next = null;
        return evenStart;

    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(4);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(6);

        head = segregateGFG(head);
        Node.display(head);

        

    }
}
