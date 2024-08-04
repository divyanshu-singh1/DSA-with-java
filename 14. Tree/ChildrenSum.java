public class ChildrenSum {
    //mine
    static boolean checkChildrenSum(Node root){
        if(root == null)
            return true;
        
        
        if(root.left == null && root.right == null){
            return true;
        }
        if(root.left != null && root.right != null){
            if(root.data == (root.left.data + root.right.data)){
                return (checkChildrenSum(root.left ) && checkChildrenSum(root.right));
            }else 
                return false;
        }else if(root.left != null && root.left.data == root.data){
            return checkChildrenSum(root.left);
        }else{
            return checkChildrenSum(root.right);
        }
    }

    //gfgf
    static boolean checkChildrenSum2(Node root){
        if(root ==null)return true;
        if(root.left == null && root.right == null)return true;
        
        int sum = 0;
        if(root.left != null ){sum += root.left.data;}
        if(root.right != null ){sum += root.right.data;}
        return (sum == root.data && checkChildrenSum(root.left) && checkChildrenSum(root.right));
    }
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(12);
        root.left.left = new Node(3);
        root.left.right  = new Node(5);

        root.right.right = new Node(12);

        System.out.println(checkChildrenSum(root));
    }
}
