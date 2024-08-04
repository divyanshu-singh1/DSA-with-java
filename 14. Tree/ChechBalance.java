public class ChechBalance {
    //a tree is balance if difference between its left and right subtree's heigt is less than or equal to 1
    // this is my approach equivalet to Naive approach works in O(N^2)
    static boolean isBalanced(Node root){
        if(root == null)
            return true;
        
        int leftHeight = Height.height(root.left);
        int rightHeight = Height.height(root.right);

        if(Math.abs(leftHeight - rightHeight) <= 1){
            return isBalanced(root.left) && isBalanced(root.right);
        }else{
            return false;
        }
    }


    /*
     * Naive gfg solution Time : O(N^2)
     */
    static boolean isBalNaive(Node root){
        if(root == null)return true;
        int lh = Height.height(root.left);
        int rh = Height.height(root.right);

        return (Math.abs(lh-rh) <= 1 && isBalNaive(root.left) && isBalNaive(root.right));
    }

    /*
     * efficient solution 
     * O(N) - calculates two thing height and also checks if subtree is balanced or not
     * -1 represents that subtree is not balanced
     * 0 or positive number represents height of the balance subtree
     */
    static int isBalEffcient(Node root){
        if(root == null)return 0;
        int lh = isBalEffcient(root.left);
        if(lh == -1)return -1;
        int rh = isBalEffcient(root.right);
        if(rh == -1)return -1;
        if(Math.abs(lh-rh) > 1) return -1;
        else   
            return Math.max(lh,rh) +1;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        // root.right.right.right = new Node(70);

        // System.out.println(isBalanced(root));
        // System.out.println(isBalNaive(root));
        System.out.println(isBalEffcient(root));
        
    }
}
