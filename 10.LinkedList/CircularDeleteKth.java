public class CircularDeleteKth {
    static public void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;

        int k = 1;

        Node.display(head);
        head = Node.deleteAtKthPos(head , k);
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

    static Node deleteAtKthPos(Node head , int k ){
        if(head == null || head.next == head)
            return null;
        
        if(k == 1){
            head.data = head.next.data;
            head.next = head.next.next;
        }
        else{
            Node curr = head;
            int pos = 1;
            while(pos < k -1 ){
                curr = curr.next;
                pos++;
            }
            curr.next  = curr.next.next;
        }
        
        return head;
    }
    
}
