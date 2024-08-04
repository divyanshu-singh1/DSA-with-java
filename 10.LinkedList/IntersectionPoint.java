public class IntersectionPoint {
    static int getPoint(Node head1 , Node head2){
        Node curr1 = head1;
        Node curr2 = head2;
        while(curr1 != null && curr2 != null){
            if(curr1.next == curr2.next){
                return curr1.data;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        Node large  , small;
        if(curr1 == null){
            small = head1;
            large = head2;
        }else{
            small = head2;
            large = head1;
        }

        while(large != null){
            if(large.next == small.next){
                return small.next.data;
            }else{
                large = large.next;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Node head1 = new Node(5);
        head1.next = new Node(3);
        head1.next.next = new Node(7);
        head1.next.next.next = new Node(10);
        head1.next.next.next.next = new Node(15);

        Node head2 = new Node(9);
        head2.next = head1.next;

       System.out.println(getPoint(head1, head2));


    }
}
