public class NthNodeFromEnd {
    static void getNth(Node head , int n){
        Node right = head  , left = head ;
        while( n-- > 0 ){
            if(right == null)return;
            right = right.next;
        }

        while(right != null){
            left = left.next;
            right = right.next;
        }
        
        System.out.println(left.data);
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        getNth(head,5);
    }
}
