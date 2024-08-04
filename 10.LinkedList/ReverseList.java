public class ReverseList {
    static Node reverseList(Node head){
        Node temp = null;
        Node curr = head;
        while(curr != null){
            Node next = curr.next;
            curr.next = temp;
            temp = curr;
            curr = next;
        }
        return temp;
    }
    static Node recursiveReverseOne(Node head , Node prev){
        if(head == null )return prev;
        Node next = head.next;
        head.next = prev;
        return recursiveReverseOne(next,head);
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = recursiveReverseOne(head,null);
        Node.display(head);
    }
}
