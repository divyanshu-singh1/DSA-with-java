public class SinglyDeletion {
    public static void main(String[] args) {
        Node head = new Node(10);
        // head.next = new Node(20);
        // head.next.next = new Node(30);
        // head.next.next.next = new Node(40);

        Node.display(head);
        head = Node.deleteAtEnd(head);
        Node.display(head);
    }
}
class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
    static void display(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
    static Node deleteAtBeg(Node head){
        if(head == null)
            return null;
        else
            return head.next;

    }
    static Node deleteAtEnd(Node head){
        if(head == null || head.next == null)
            return null;
        Node curr = head;
        while(curr.next.next != null){
            curr =curr.next;
        }
        curr.next = null;
        return head;
    }
}