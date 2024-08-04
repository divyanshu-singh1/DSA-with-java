import java.util.Arrays;

public class SelectionSort {
    static void selection(int []arr){
        int n = arr.length;
        for(int i = 0;i<n-1; i++){
            int min_ind = i;
            for(int j = i+1; j< n;j++){
                if(arr[j] < arr[i])
                    min_ind= j;
            }
            
            int temp  = arr[i] ;
            arr[i] = arr[min_ind];
            arr[min_ind] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,2,0,-1,45,-2,-2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
