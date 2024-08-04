    /*
 * This is the base class which will be used in this folder to create Nodes of linked list it will also have the methods
 * for doing the basic BST operations
 */
public class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
    static boolean search(Node root,int target){
        if(root == null)return false;
        if(root.data == target)return true;
        if(root.data < target){
            return search(root.right, target);
        }else  
            return search(root.left,target);
    }
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(3);
        // root.left.right = new Node(50);
        root.right.left = new Node(18);
        root.right.right = new Node(80); 
        root.right.left.left = new Node(16);

        System.out.println(search(root, 17));

    }
}
