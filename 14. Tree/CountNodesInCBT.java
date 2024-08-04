public class CountNodesInCBT {

    /*
     *this is my code which i wrote after the hint 
     */
    static int getLHeight(Node left){
        if(left == null)return 0;
        return getLHeight(left.left) +1;
    }
    static int getRHeight(Node right){
        if(right == null)return 0;
        return getRHeight(right.right)+1;
    }
    static int getCount(Node root){
        if(root == null)return 0;
        int lh = getLHeight(root.left);
        int rh = getRHeight(root.right);

        if(lh == rh){
            // System.out.println("Returning : "+(int)Math.pow(2,lh+1)+" from node "+root.data);
            return (int)Math.pow(2,lh+1) -1;
        }else{
            int curr = getCount(root.left)+getCount(root.right)+1;
            // System.out.println("Returning : "+curr+" from node "+root.data);
            return curr;
        }
    }

    static int countNodes(Node root){
        int lh =0, rh = 0;

        Node curr = root;
        while(curr != null){
            lh++;
            curr = curr.left;
        }

        curr = root;
        while(curr != null){
            rh++;
            curr = curr.right;
        }

        if(lh == rh)
            return (int)Math.pow(2, rh)-1;
        else
            return countNodes(root.left)+countNodes(root.right)+1;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        root.left.left.left = new Node(80);
        root.left.left.right= new Node(90);
        root.left.right.left = new Node(100);



        System.out.println(getCount(root));
        System.out.println(countNodes(root));
    }
}
