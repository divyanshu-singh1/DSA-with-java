import java.util.Arrays;

public class MergeSort {
    static void merge(int arr[] , int low, int mid ,int high){
        int n1 = mid-low+1 , n2 = high -mid;
        int  left[] = new int[n1];
        int right[] = new int[n2];

        for(int i = 0 ; i< n1;i++)
            left[i] = arr[i+low];
        
        for(int i = 0 ; i< n2;i++)
            right[i] = arr[i+mid+1];

        int i = 0 , j = 0 , k = low;

        while( i< n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }else 
                arr[k++] = right[j++];
        }

        while(i < n1){
            arr[k++] = left[i++];
        }

        while(j < n2){
            arr[k++] = right[j++];
        }

    }
    static void mergeSort(int arr[] ,int low ,int high){
        if(high > low){
            int mid = low + (high-low)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr,mid+1,high);
            merge(arr, low, mid, high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,43,0,-9,6,-9,3,1,54};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
