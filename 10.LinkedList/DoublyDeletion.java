public class DoublyDeletion {
    static public void main(String []args){
        Node head = new Node(10);

        head.next = new Node(20);
        head.next.prev = head;
        
        head.next.next  = new Node(30);
        head.next.next.prev = head.next;

        // Node.display(head);
        // head = Node.deleteAtBeg(head);
        // Node.display(head);
        
        Node.display(head);
        head = Node.deleteAtEnd(head);
        Node.display(head);
    }
}
class Node{
    int data;
    Node next;
    Node prev;
    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
    static void display(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
    
    static Node  deleteAtBeg(Node head){
        if(head == null || head.next == null)
            return null;

        head = head.next;
        head.prev = null;
        return head;
    }
    static Node deleteAtEnd(Node head){
        if(head == null || head.next == null)
            return null;
        
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }

        curr.next = null;
        return head;
    }
    
}
