public class Diameter {
    //bad approach Big o of N square
    static int getDiameter(Node root){
        if(root == null)return 0;
        
        int lh = Height.height(root.left);
        int rh = Height.height(root.right);
        return Math.max(lh+rh,Math.max(getDiameter(root.left),getDiameter(root.right)))+1;
    }

    //optimal with O(n)

// class Solution {
//     static int res;
//     static int height(TreeNode root){
//         if(root == null)return 0;

//         int lh = height(root.left);
//         int rh = height(root.right);

//         res = Math.max(res,lh + rh);
//         return Math.max(lh,rh) + 1;
//     }
//     public int diameterOfBinaryTree(TreeNode root) {
//         res = 0;
//         height(root);
//         return res;
//     }
// }
    public static void main(String[] args) {
        //sample 1
        // Node root = new Node(10);
        // root.left = new Node(20);
        // root.right = new Node(30);
        // root.left.left = new Node(40);
        // root.left.right = new Node(50);
        // root.right.left = new Node(60);
        // root.right.right = new Node(70); 

        //sample 2
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        root.right.left.left = new Node(60);
        // root.right.right = new Node(70); 

        System.out.println(getDiameter(root));
    }
}
