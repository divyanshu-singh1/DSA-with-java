public class NodeAtKDistance {
    //my
    static void kdist(Node root,int i , int k){
        if(root == null)
            return;
        if(k == i){
            System.out.print(root.data+" ");
        }else{
            kdist(root.left, i+1, k);
            kdist(root.right, i+1, k);
        }
    }

    //gfg
    static void kDist(Node root ,int k ){
        if(root == null)
            return;
        if(k == 0)
            System.out.print(root.data+" ");
        else{
            kDist(root.left, k-1);
            kDist(root.right, k-1);
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

        // kdist(root, 0, 1);
        kDist(root, 2);

    }
}
