public class BurnTreeFromLeaf {
    //global value for result
    static int res = 0;
    static class Distance{
        int val;
        Distance(int x){
            val = x;
        }
    }

    /*
     * this method only works for leaf nodes
     * there is a methdo taught by babbar and striver which works for any node but 
     * has greater complexity
     */
    static int burnTree(Node root , int leaf, Distance dist){
        if(root== null)return 0;
        if(root.data == leaf){dist.val = 0 ; return 1;}
        Distance ldist = new Distance(-1);
        Distance rdist = new Distance(-1);

        int lh = burnTree(root.left, leaf, ldist);
        int rh = burnTree(root.right, leaf, rdist);

        if(ldist.val != -1){
            dist.val = ldist.val + 1;
            res = Math.max(dist.val+rh,res);
        }else if(rdist.val != -1){
            dist.val = rdist.val+1;
            res = Math.max(dist.val + lh,res);
        }
        return Math.max(lh,rh)+1;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.left.left.left = new Node(60);
        root.left.left.left.left = new Node(70);
        
        // BurnTreeFromLeaf outer = new BurnTreeFromLeaf();

        // BurnTreeFromLeaf.Distance dist = outer.new Distance(-1);

        Distance dist = new Distance(-1);
        burnTree(root, 50, dist);
        System.out.println(res);

    }
}
