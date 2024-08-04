public class RemoveDuplicatesFromSortedList {

    static void remvoveDuplicates(Node head){
        
        Node curr= head;
        while(curr != null){
            if(curr.next != null && curr.next.data == curr.data){
                curr.next = curr.next.next;
            }else   
                curr = curr.next;
        }

    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(10);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(30);
        Node.display(head);
        remvoveDuplicates(head);
        Node.display(head);

    }
}
