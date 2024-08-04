import java.util.*;

public class IterativePreOrder {
    /*
     * my code 
     * worked for this sample but probably is not right
     */
    // static void preOrd(Node root){
    //     Deque<Node> s = new ArrayDeque<>();
    //     Node curr = root;
    //     while(curr != null || s.isEmpty() == false){
    //         while(curr != null){
    //             System.out.print(curr.data+" ");
    //             s.push(curr);
    //             curr = curr.left;
    //         }

    //         curr = s.pop();
    //         curr = curr.right;
    //     }
    // }

    /*
     * correct 
     */

    /*
     * time O(n), space O(h)
     */
    static void preOrd(Node root){
        Deque<Node> s = new ArrayDeque<>();
        s.push(root);
        while(s.isEmpty() == false){
            Node curr = s.pop();
            System.out.print(curr.data+" ");
            if(curr.right != null)s.push(curr.right);
            if(curr.left != null)s.push(curr.left);
        }
    }

    /*
     * time O(n), space O(h)
     */

    static void preOrdSpaceOpt(Node root){
        if(root == null)return;
        Deque<Node> s = new ArrayDeque<>();
        Node curr = root;
        while(curr != null || s.isEmpty() == false){
            while (curr != null) {
                System.out.print(curr.data+ " ");
                if(curr.right != null)
                    s.push(curr.right);
                curr = curr.left;
            }
            if(s.isEmpty() == false)
                curr = s.pop();
        }

    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        // preOrd(root);
        preOrdSpaceOpt(root);
    }
}
