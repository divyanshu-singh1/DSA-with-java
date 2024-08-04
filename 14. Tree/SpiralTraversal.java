import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;



public class SpiralTraversal {
    static int index = 0;

    //code absolutely correct
    static void spiral(Node root){
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while(q.isEmpty() == false){
            Deque<Node> s = new ArrayDeque<>();
            int count = q.size();
            for(int i = 0 ; i < count ; i++){
                Node curr = q.poll();
                if(index % 2 == 0){
                    System.out.print(curr.data+" ");
                }else{
                    s.push(curr);
                }
                if(curr.left != null)q.offer(curr.left);
                if(curr.right != null)q.offer(curr.right);
            }
            if(index%2 != 0){
                while(s.isEmpty() == false){
                    System.out.print(s.pop().data+" ");
                }
            }
            System.out.println();
            index++;
        }
    }

    //gfg methods just like my code uses bolean flag instead of even odd
    // to reverse alternate levels

    static void gfgMethod1(Node root){

        Queue<Node> q = new ArrayDeque<>();
        Stack<Integer> s = new Stack<>();
        boolean reverse = false; 
        q.offer(root);
        while(q.isEmpty() == false){
            int count = q.size();
            for(int i = 0 ; i < count ; i++){
                Node curr = q.poll();
                if(reverse)
                    s.push(curr.data);
                else   
                    System.out.print(curr.data+" ");

                if(curr.left != null)q.offer(curr.left);
                if(curr.right != null)q.offer(curr.right);
            }
            if(reverse){
                while(s.isEmpty() == false){
                    System.out.print(s.pop() +" ");
                }
            }
            reverse = !reverse;
            System.out.println();
        }
    }

    /*
     * here we is two stacks so each nodes has to go into
     * one data structure only like methods 1 where nodes has to go
     * first into queue then stack
     * 
     */
    static void gfgMethod2(Node root){
        Deque<Node> s1 = new ArrayDeque<>();
        Deque<Node> s2 = new ArrayDeque<>();
        s1.push(root);
        while(s1.isEmpty() == false || s2.isEmpty() == false){
            while(s1.isEmpty() == false){
                Node curr = s1.pop();
                System.out.print(curr.data+" ");
                if(curr.left != null)s2.push(curr.left);
                if(curr.right != null)s2.push(curr.right);
            }
            System.out.println();
            while(s2.isEmpty() == false){
                Node curr = s2.pop();
                System.out.print(curr.data+" ");
                if(curr.right != null)s1.push(curr.right);
                if(curr.left != null)s1.push(curr.left);
            }
            System.out.println();
        }
    }
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
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7); 
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.right.left.left = new Node(10);

        // spiral(root);
        // gfgMethod1(root);
        gfgMethod2(root);
    }
}
