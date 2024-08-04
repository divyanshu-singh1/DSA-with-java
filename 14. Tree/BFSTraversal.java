import java.util.*;

public class BFSTraversal {
    //level order traversal 
    /*
     * i am thinking that find the hieght of tree then 
     * from 0 -> height , run method to print nodes at k distance only
     * 
     */

    static void leverOrder(Node root){
        //i have Height class with method height to calculate heigt
        int height = Height.height(root);
        for(int k = 0 ; k < height ; k++){
            NodeAtKDistance.kDist(root,k);
            System.out.println();
        }

    }

    static void levelOrder2(Node root){
        /*
         * hint is to use Queue
         * this is also the correct optimal solutio
         */
        Queue<Node> q = new ArrayDeque<>();
        q.offer(root);
        while(q.isEmpty() == false){
            Node curr = q.peek();
            if(curr.left != null)q.offer(curr.left);
            if(curr.right != null)q.offer(curr.right);
            System.out.print(q.poll().data+" ");
        }
    }

    // Now two methods for line by line traversal 
    static void lineByline1(Node root){
        if(root == null)return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(q.size() > 1){
            Node curr = q.poll();
            if(curr == null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.data+" ");
            if(curr.left != null)q.add(curr.left);
            if(curr.right != null)q.add(curr.right);
        }
    }

    //second method using extra loop
    static void lineByline2(Node root){
        if(root == null)return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.isEmpty() == false){
            int count = q.size();
            for(int i = 0 ; i < count ;i ++){
                Node curr = q.poll();
                System.out.print(curr.data+" ");
                if(curr.left != null)q.add(curr.left);
                if(curr.right != null)q.add(curr.right);
            }
            System.out.println();
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

        // leverOrder(root);

        //levelOrder2(root);
        // lineByline1(root);
        lineByline2(root);
    }
}
