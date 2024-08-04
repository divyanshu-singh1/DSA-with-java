public class Maximum {
    static int getMax(Node root){
        if(root == null)
            return 0;
        else {
            
            int a = getMax(root.left);
            int b = getMax(root.right);
            int curr_max = Math.max(a,b);
            return Math.max(root.data,curr_max);

        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(900);
        root.right.left = new Node(60);
        root.right.right = new Node(70); 

        System.out.println(getMax(root));
    }
}
