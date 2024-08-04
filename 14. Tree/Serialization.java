import java.util.*;
public class Serialization {

    /*
     * these are my code , i am not sure whether they are right are not
     */

    static void serialize(Node root,ArrayList<Integer> arr){
        if(root == null)return;
        Deque<Node> q = new LinkedList<>();
        q.add(root);

        int total = (int)Math.pow(2,Height.height(root))-1;
        System.out.println(total+" is the toatl");
        while(q.isEmpty() == false){
            int count = q.size();
            for(int i = 0 ; i< count ; i++){
                Node curr = q.poll();
                if(curr == null){
                    arr.add(Integer.MIN_VALUE);
                    if(arr.size() == total)return;
                    continue;
                }
                
                q.offer(curr.left);
                q.offer(curr.right);

                arr.add(curr.data);
                if(arr.size() == total)return;
            }
        }
    }
    static Node deserialize(ArrayList<Integer> list){
        int n = list.size();
        ArrayList<Node> nodeList = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            nodeList.add(new Node(list.get(i)));
        }
        
        for(Node x : nodeList){
            System.out.print(x.data+ " ");
        }

        for(int i = 0 ;i < n; i++){
            Node curr = nodeList.get(i);
            if(2*i+1 < n)curr.left = nodeList.get(2*i+1);
            if(2*i+2 < n)curr.right = nodeList.get(2*i+2);
        }

        return nodeList.get(0);
    }

    /*
     * gfg actual solution
     */
    static final int EMPTY =-1;
    void ser(Node root , ArrayList<Integer> arr){
        if(root == null){
            arr.add(EMPTY);
            return;
        }
        arr.add(root.data);
        ser(root.left,arr);
        ser(root.right,arr);
    }

    static int index = 0;
    static Node des(ArrayList<Integer> arr){
        if(index == arr.size() )return null;
        int val = arr.get(index);
        index++;
        if(val == EMPTY)return null;
        Node root = new Node(val);
        root.left = des(arr);
        root.right = des(arr);
        return root;
    }
    
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        // root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(60);
        // root.right.right = new Node(70);


        ArrayList<Integer> listInput = new ArrayList<>(Arrays.asList(10,20,30,Integer.MIN_VALUE,50,60,Integer.MIN_VALUE));


        // //code to check serialization 
        // ArrayList<Integer> result = new ArrayList<>();
        // serialize(root, result);
        // System.out.println(result);

        //code to check deserialization
        // System.out.println(listInput);
        Node output = deserialize(listInput);
        BFSTraversal.lineByline2(root);



    }
}
