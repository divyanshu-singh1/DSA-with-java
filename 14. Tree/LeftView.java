import java.util.*;

public class LeftView {

    //recursive code for printing leftmost nodes on each level

    //starts 
    static int maxLevel = 0;
    static void printLeftView(Node root){
        printLeft(root,1);
    }
    static void printLeft(Node root , int level){
        if(root == null)
            return;
        if(maxLevel < level){
            System.out.print(root.data+ " ");
            maxLevel = level;
        }
        printLeft(root.left, level+1);
        printLeft(root.right,level+1);
    }

    //ends

    //iterative solution to print left most nodes on each level

    // start 
    static void printLeftViewIterative(Node root){
        if(root == null)return;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        
        while(q.isEmpty() == false){
            int count = q.size();
            for(int i = 0 ; i < count ; i++){
                Node curr = q.poll();

                if(i == 0)
                    System.out.print(curr.data+" ");
                
                if(curr.left != null)q.offer(curr.left);
                if(curr.right != null)q.offer(curr.right);
            }
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

        // printLeftView(root);
        printLeftViewIterative(root);
    }
    
}
