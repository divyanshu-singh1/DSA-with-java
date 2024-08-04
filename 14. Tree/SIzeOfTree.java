public class SIzeOfTree {

    //my code
    static int getHeight(Node root){
        if(root == null)
            return 0;
        int count = 1;
        if(root.left != null)
            count += getHeight(root.left);
        if(root.right != null)
            count += getHeight(root.right);
        return count;
      
    
    }

    //gfg code
    static int getSize(Node root){
        if(root == null)
            return 0;
        else
            return 1 + getSize(root.left) + getSize(root.right);
    }
    public static void main(String[] args) {
         Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70); 

        // System.out.println(getHeight(root));
        System.out.println(getSize(root));
    }
}
