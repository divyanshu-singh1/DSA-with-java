public class CircularSingly {
    static public void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;
        
        

        // Node.display(head);
        // head = Node.insertAtBegEfficient(head, 99);
        // Node.display(head);

        // Node.display(head);
        // head = Node.insertAtEndEfficient(head, -5);
        // Node.display(head);

        // Node.display(head);
        // head = Node.deleteAtBeg(head);
        // Node.display(head);
        
        Node.display(head);
        head = Node.deleteAtBegEffcient(head);
        Node.display(head);
        
    }
}
class Node{
    int data;
    Node next;
    Node(int val){
        data = val;
        next = null;
    }

    static void display(Node head){
        if(head == null)
            return;
        Node curr = head;
        do{
            System.out.print(curr.data+" ");
            curr = curr.next;
        }while(curr != head);

        System.out.println();
    }

    /*
     * Naive 
     * 
     * O(n) operation ,we  traverse till last element 
     * to do the same in O(1) 
     * we add new node just after head and swap the data these two
     */
    static Node insertAtBeg(Node head,int val){
        Node temp = new Node(val);
        if(head == null){
            temp.next = temp;
            return temp;
        }
        Node curr = head;

        do{
            curr = curr.next;
        }while(curr.next != head);

        temp.next = curr.next;
        curr.next = temp;
        return temp;
    }
    //Efficient 
    static Node insertAtBegEfficient(Node head , int val){
        Node temp = new Node(val);
        if(head == null){
            temp.next = temp;
            return temp;
        }
        temp.next = head.next;
        head.next = temp;

        int x = head.data;
        head.data = temp.data;
        temp.data = x;
        return head;
    }

    //Naive O(n)
    static Node insertAtEnd(Node head,int val){
        Node temp = new  Node(val);
        if(head == null){
            temp.next  = temp;
            return temp;
        }
        Node curr = head;
        while(curr.next != head){
            curr = curr.next;
        }
        curr.next =temp;
        temp.next = head;
        return head;
    }

    //Efficient O(1)
    static Node insertAtEndEfficient(Node head, int val){
        Node temp = new Node(val);
        if(head == null){
            temp.next = temp;
            return temp;
        }

        temp.next = head.next;
        head.next = temp;

        int x = temp.data;
        temp.data = head.data;
        head.data = x;
        return temp;
    }

    // naive O(N)
    static Node deleteAtBeg(Node head){
        if(head == null || head.next == head )
            return null;
        Node curr = head;
        while(curr.next != head){
            curr  = curr.next;
        }
        curr.next = head.next;

        return head.next;
    }

    //Efficient O(1)
    static Node deleteAtBegEffcient(Node head){
        if(head == null || head.next == head )
            return null;
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }
}
