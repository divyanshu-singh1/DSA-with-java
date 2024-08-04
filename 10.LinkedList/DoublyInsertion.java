public class DoublyInsertion {

    public static void main(String[] args) {
        Node head = new Node(10);

        head.next = new Node(20);
        head.next.prev = head;
        
        head.next.next  = new Node(30);
        head.next.next.prev = head.next;
        
        // Node.display(head);
        // head = Node.insertAtBeg(head,5);
        // Node.display(head);

        // Node.display(head);
        // head = Node.insertAtEnd(head,35);
        // Node.display(head);

        Node.display(head);
        head = Node.reverse(head);
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
    
    static Node insertAtBeg(Node head , int val){
        Node temp = new Node(val);
        if(head == null)
            return temp;
        
        head.prev = temp;
        temp.next = head;
        return temp;
    }
    static Node insertAtEnd(Node head,int val){
        Node temp = new Node(val);
        if(head == null){
            return temp;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;

    }

    static Node reverse(Node head){
        if(head == null || head.next == null)
            return head;
        
        Node prev = null, curr = head;
        while(curr != null){
            prev  = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }
        return prev.prev;
    }
}
