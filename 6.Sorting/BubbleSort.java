import java.util.Arrays;

public class BubbleSort {
    static void bubble(int []arr){
        int n = arr.length;
        for( int i = 0 ; i < n ;i++)
            for(int j = 0 ; j< n -i-1 ;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]  =temp;
                }
            }
    }
    //more efficient ,using flags
    static void bubble2(int []arr){
        int n = arr.length;
        /*
         * here we use a flag 
         * if in any iteration there are no swaps (arrays is sorted)
         * the flag weill remain false and 
         * so we will break outer loop 
         */
        boolean swapped = false;
        for( int i = 0 ; i < n ;i++){
            for(int j = 0 ; j< n -i-1 ;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]  =temp;
                    swapped = true;
                }
            }
            if(!swapped)break;
        }
    }

    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,2,0,-1,45,-2,-2};
        bubble2(arr);
        System.out.println(Arrays.toString(arr));
    }
}
