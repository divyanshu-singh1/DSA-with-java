public class Boundary {
    static void displayBoundary(int arr[][]){
        if(arr.length == 1){
            for(int i = 0 ; i < arr[0].length ;i++)
                System.out.print(arr[0][i]+ " ");
        }
        
        for(int i = 0 ; i < arr.length ; i++){
            if(i == 0){
                for(int j = 0 ; j < arr[0].length ; j++)
                    System.out.print(arr[0][j]+" ");
            }else if(i == arr.length -1){
                for(int j = arr[i].length -1 ; j >= 0 ;j--)
                    System.out.print(arr[i][j]+ " ");
            }else{
                System.out.print(arr[i][arr[i].length-1]+" ");
            }
        }

        for(int i = arr.length- 2; i >= 1 ; i-- ){
            System.out.print(arr[i][0]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[][] = { {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        int arr2[][] = {{1,2,3,4}};
                        // {5,6,7,8}};
                
        int arr3[][] = {{1},{2},{3},{4}};

        displayBoundary(arr3);

    }
}
