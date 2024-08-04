public class SinglySearch {
     public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Node.display(head);
        System.out.println(Node.searchRecursive(head,0));
        // Node.display(head);
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

    static boolean search(Node head,int key){

        Node curr = head;
        int pos = 0;
        while(curr != null){
            pos++;
            if(curr.data == key){
                System.out.println(pos);
                return true;
            }
            curr = curr.next;
        }
        return  false;
    }

    static int searchRecursive(Node node, int key ){
        if(node == null)return -1;
        if(node.data == key)
            return 1;
        else{
            int res = searchRecursive(node.next, key);
            return res == -1 ? -1 : res + 1;
        }
    }
    
}
