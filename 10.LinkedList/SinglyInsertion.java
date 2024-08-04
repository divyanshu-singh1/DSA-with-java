

public class SinglyInsertion {


    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        Node.display(head);
        head  = Node.insertAtPos(head,-2,6);
        // head  = Node.insertAtPos(head,60);
        // head  = Node.insertAtPos(head,70);
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
    static Node insertAtBeg(Node head , int val){
        Node temp = new Node(val);
        temp.next = head;
        return temp; 

    }
    static Node insertAtEnd(Node head, int val){
        Node temp = new Node(val);
        if(head == null)
            return temp;
        Node curr = head;
        while(curr.next != null){
            curr= curr.next;
        }
        curr.next = temp;
        return head;
    }
    static Node insertAtPos(Node head,int val,int pos){
        Node temp = new Node(val);
        if(pos == 1){
            temp.next=head;
            return temp;
        }
        Node curr  = head;
        int curr_pos = 1;
        while(curr_pos < pos -1 && curr != null){
            curr_pos++;
            curr = curr.next;
        }
        if(curr != null){
            temp.next = curr.next;
            curr.next = temp; 
        }else
            System.out.println("Invalid position");
    
        return head;
    }
}