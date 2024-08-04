import java.util.*;

public class IterativeInOrder {
    static void inOrd(Node root){
        Deque<Node> s = new ArrayDeque<>();
        Node curr = root;
        while(curr != null || s.isEmpty() == false){
            while(curr != null){
                s.push(curr);
                curr = curr.left;

            }
            curr = s.pop();
            System.out.print(curr.data+" ");
            curr = curr.right;
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

        inOrd(root);
    }
}
