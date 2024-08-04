public class Transpose {
    /*
     * this is my approach
     */
    static void makeTranspose(int arr[][]){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(i == j){
                    int count = 1;
                    while(count <= i){
                        int temp = arr[i][j-count];
                        arr[i][j-count] = arr[i-count][j];
                        arr[i-count][j] = temp;
                        count++;
                    }
                }
            }
        }
    }
    /*
     * effcient gfg approach
     * 
     */
    static void transpose(int arr[][]){
        for(int i = 0 ; i < arr.length ; i ++){
            for(int j = i+1 ; j < arr.length ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    static void displayMatrix(int arr[][]){
        for(int i = 0 ; i< arr.length ; i++)
        {
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[][] = { {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        // displayMatrix(arr);
        // makeTranspose(arr);
        // displayMatrix(arr);

        displayMatrix(arr);
        transpose(arr);
        displayMatrix(arr);

    }   
}
