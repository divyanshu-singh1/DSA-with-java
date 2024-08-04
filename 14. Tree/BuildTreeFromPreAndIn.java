public class BuildTreeFromPreAndIn {
    static int preIndex = 0;
    static Node cTree(int in[] , int []pre , int start , int end){
        if(start > end)return null; //for leaf nodes

        Node root = new Node(pre[preIndex++]);

        //geting index for this elment in in[] so that we can get its
        // left and right subtree
        int inIndex= 0;
        for(int i = start ; i <= end ;i++){
            if(in[i] == root.data){
                inIndex = i;
                break;
            }
        }

        root.left = cTree(in,pre,start,inIndex-1);
        root.right = cTree(in,pre,inIndex+1,end);
        return root;
    }
    public static void main(String[] args) {
        int []in = {20,10,40,30,50};
        int []pre = {10,20,30,40,50};

        Node root = cTree(in,pre,0,4);

        System.out.print("Inorder traversal is: ");
        DFSTraversal.inOrder(root);
        System.out.println();

        System.out.print("Pre Order traversal is : ");
        DFSTraversal.preOrder(root);
    }
}
