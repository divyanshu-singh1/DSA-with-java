public class ConvertToDLL {
    /*
     * so we have to convert into dll with in inorder fashio
     * we will use left as previous and right as next pointer
     * prev class variable is used to change links and keep track of last node
     */

    //anuj bhaiya named channel
    // static Node prev = null , head = null;
    // static void convert(Node root){
    //     if(root == null)return;
    //     convert(root.left);

    //     if(prev == null)head = root;
    //     else{
    //         prev.right = root;
    //         root.left = prev;
    //     }
    //     prev = root;
    //     convert(root.right);
    // }


    


    
    //gfg implementation which does not require 
    // static head variable and has return type node
    static Node prev = null; 
    static Node convertGFG(Node root){
        if(root == null)return null;
        Node head = convertGFG(root.left);
        if(prev == null)head = root;
        else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        convertGFG(root.right);
        return head;
    }


    static void printDDL(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.right;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        // convert(root);
        Node head = convertGFG(root);
        printDDL(head);
        
    }
    
}
