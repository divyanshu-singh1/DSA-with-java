public class Matrix {
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
    
}
