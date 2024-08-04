import java.util.ArrayList;

public class LowestCommonAncestor {
    //naive
    static boolean findPath(Node root,ArrayList<Node> p, int n){
        if(root == null)return false;
        p.add(root);
        if(root.data == n)return true;
        if(findPath(root.left,p,n) || findPath(root.right,p,n)){
            return true;
        }
        p.remove(p.size()-1);
        return false;
       
    }
    static Node lcaNaive(Node root, int n1 ,int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        if(findPath(root, path2, n2) == false || findPath(root, path1, n1) == false){
            return null;
        }
        for(int i = 0 ; i < path1.size()-1 && i < path2.size()-1 ;i++){
            if(path1.get(i+1) != path2.get(i+1))
                return path1.get(i);
        }
        return null;
    }

    static Node lcaEffcient(Node root, int n1 , int n2){
        if(root == null)
            return null;
        if(root.data == n1 || root.data == n2)
            return root;

        Node left = lcaEffcient(root.left, n1, n2);
        if(left != null)return left;
        Node right = lcaEffcient(root.right, n1, n2);
        if(right != null)return right;
        
        return null;
        
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        // root.right.left = new Node(60);
        // root.right.right = new Node(70);5 

        // Node ans = lcaNaive(root, 30, 40);
        // System.out.println(ans == null ? ans : ans.data); 


        Node ans = lcaEffcient(root, 50, 40);
        System.out.println(ans == null ? ans : ans.data); 

    }
}
