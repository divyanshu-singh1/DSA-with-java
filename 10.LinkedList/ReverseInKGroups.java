public class ReverseInKGroups {

    /*
     * gfg code iterative
     */
    static Node reverseK(Node head ,int k){
        
        Node curr = head , prevFirst = null;
        boolean isFirstPrev = true;
        while(curr != null ){
            Node first = curr , prev  = null;
            int count = 0;
            while(curr != null && count < k){
                Node next = curr.next;
                curr.next  = prev ;
                prev = curr;
                curr = next;
                count++;
            }

            if(isFirstPrev){
                head = prev;
                isFirstPrev= false;
            }else   
                prevFirst.next = prev;
            
            prevFirst = first;
        }
        return head;
    }

    /*
     * i wrote this code
     */
    // static Node reverseK(Node head ,int k){
    //     boolean flag = true;
    //     Node curr = head , first , res = null , chain= null ;
    //     while(curr != null ){
    //         first = curr;
    //         Node temp = null;
    //         for(int i = 0 ; i< k && curr != null; i++){
    //             Node next = curr.next;
    //             curr.next  = temp ;
    //             temp = curr;
    //             curr = next;
    //         }

    //         if(flag){
    //             res = temp;
    //             flag = false;
    //         }
            
    //         if(chain != first &&  chain != null){
    //             chain.next = temp;
    //         }
    //         chain = first;
            
    //         // System.out.println(temp.data+"  "+first.data);
    //         // if(curr != null)System.out.println(curr.data);

    //     }
    //     return res;
    // }
    static Node reverseKRecursive(Node head , int k){
        Node curr = head , next = null , prev = null;
        int count = 0;
        while(count < k && curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        if(next != null){
            Node restHead = reverseK(next, k);
            head.next = restHead;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);

        // head = reverseK(head, 1);
        // Node.display(head);

        head = reverseK(head, 4);
        Node.display(head);

    }
}
