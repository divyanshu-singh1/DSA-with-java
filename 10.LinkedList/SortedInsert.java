public class SortedInsert {
    static public void main(String ...args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        
        Node.display(head);
        head = Node.sortedInsert(head,45);
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
    static Node sortedInsert(Node head , int val){
        Node temp = new Node(val);
        if(head == null){
            return temp;
        }

        if(head.data > val){
            temp.next = head;
            return temp;
        }
        Node curr = head; 
        while(curr.next != null && curr.next.data < val){
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
    
        return head;

    }
    
}