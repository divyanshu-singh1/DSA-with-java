public class Middle {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next = new Node(15);
        head.next.next.next.next = new Node(25);
        head.next.next.next.next.next = new Node(30);
        
        Node.getMiddle(head);
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
    static void getMiddle(Node head){
        Node slow = head , fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.data);
    }
    
}