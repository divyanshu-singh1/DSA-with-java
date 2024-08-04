public class RotateMatrix {
    /*
     * naive approach O(n^2) space and time
     */
    static void rotateMatrix(int arr[][]){
        int n = arr.length;
        int temp[][] = new int[n][n];

        for(int i = 0 ; i < arr.length ; i++){
            for(int  j = 0 ; j < arr.length ; j++){
                temp[n-j-1][i] = arr[i][j];
            }
        }


        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length ; j++){
                arr[i][j] = temp[i][j];
            }
        }
        
    }

    /*
     * effcient solution 
     * works in (n^2 ) time and constand space
     * here we first findt the transpose of matrix then reverse columns
     */
    static void rotate(int arr[][]){
        Transpose.transpose(arr);
        int n = arr.length;
        for(int i = 0 ; i <= n-i-1 ; i++ ){
            for(int j = 0 ; j < n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[n-i-1][j];
                arr[n-i-1][j] = temp;
            }
        }
    }

    /*
     * gfg solution change is in reversing columns
     * not sure if my function above is revrsing properly
     */
    static void rotate90(int arr[][]){
        
        Transpose.transpose(arr);
        int n = arr.length;
        for(int i = 0 ; i<n;i++){
            int low = 0 , high =  n-1;
            while(low < high){
                int temp = arr[low][i];
                arr[low][i] = arr[high][i];
                arr[high][i] = temp;
                low++;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][] = { {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        Matrix.displayMatrix(arr);
        rotate90(arr);
        Matrix.displayMatrix(arr);
        
    }
}
