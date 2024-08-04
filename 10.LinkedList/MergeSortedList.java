public class MergeSortedList {
    static Node merge(Node head1 , Node head2){
        Node curr1 = head1; 
        Node curr2 = head2;
        Node res ;
        Node tail;
        if(curr1.data < curr2.data){
            tail = curr1;
            res = curr1;
            curr1 = curr1.next;
        }else{
            tail = curr2;
            res = curr2;
            curr2 = curr2.next;
        }
        while(curr1 != null && curr2 != null){
            if(curr1.data < curr2.data){
                tail.next = curr1;
                tail = curr1;
                curr1 = curr1.next;
            }else{
                tail.next = curr2;
                tail = curr2;
                curr2 = curr2.next;
            }
        }
        if(curr1 == null){
            tail.next= curr2;
        }else   
            tail.next = curr1;
        
        return res;
    }
    public static void main(String[] args) {
        
    }
}
