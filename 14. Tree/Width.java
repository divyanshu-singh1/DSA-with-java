import java.util.*;
public class Width {

    /*
     * idea is to do  level order traversal line by line and at each level we update tha max width
     */
    static int getWidth(Node root){
        if(root == null) return 0;
        Queue<Node> q = new ArrayDeque<>();
        int maxWidth =0;
        q.add(root);
        while(q.isEmpty() == false){
            int size = q.size();
            maxWidth = Math.max(maxWidth,size);
            for(int i = 0 ; i < size ; i++){
                Node curr = q.poll();
                if(curr.left != null)q.offer(curr.left);
                if(curr.right != null)q.offer(curr.right);
            }
        } 
        return maxWidth;  

    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        // root.right.left = new Node(60);
        root.right.right = new Node(70);

        System.out.println(getWidth(root));
    }
}
