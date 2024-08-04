public class DetectRemoveLoop {
    static boolean hasLoop(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;

    }
    static void removeLoop(Node head){
        if(head.next == head){
            head.next = null;
            return;
        }
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow.next == fast){
                slow.next = null;
                break;
            }
        }
    

    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        
        head.next.next.next.next = new Node(30);
        head.next.next.next.next.next = head;

        // Node.display(head);
        System.out.println(hasLoop(head));
        
    }
}
