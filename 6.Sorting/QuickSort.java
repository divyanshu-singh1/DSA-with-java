import java.util.Arrays;
public class QuickSort {

    /*
     * naive partitioning lagorithm 
     * stable 
     * 
     */
    static void naive(int arr[] , int l , int h , int p){
        int temp[] = new int[h-l+1];
        int index = 0;
        //copy all small and equal elements
        for(int i = l ; i<= h;i++)
            if(arr[i] <= arr[p])
                temp[index++] = arr[i];
                 
        //copy all large elements
        for(int i = l ; i<=h; i++)
            if(arr[i] > arr[p])
                temp[index++] = arr[i];

        //copy back temp to og array
        for(int i = l ; i <= h ;i++)
            arr[i] = temp[i-l];
    }

    
    /*
     * lomuto partitioning algorithm
     * nlogn , unstable , inplacee
     */
    static int lomuto(int arr[] , int l , int h){
        int pivot = arr[h];
        int i = l-1;
        for(int j = l; j<= h-1 ;j++){
            if(arr[j] <= pivot){
                i++;
                int  temp = arr[i];
                arr[i] = arr[j] ;
                arr[j] = temp;
            }
        }
        int  temp = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = temp;
        return i+1;
    }

    /*
     * hoare partitioning algorithm
     * nlogn , unstable , in place better than lomuto
     */
    static int hoare(int arr[] , int l , int h){
        int pivot = arr[l];
        int i = l-1 , j = h+1;
        while(true){
            do{
                i++;
            }while(arr[i] < pivot);

            do{
                j--;
            }while(arr[j] > pivot);

            if(i >= j) return j;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }
    /*
     * Quick sort using lomuto partiion
     */
    static void quickLomuto(int arr[] , int l , int h){
        if(l < h){
            int p = lomuto(arr, l, h);
            quickLomuto(arr, l, p-1);
            quickLomuto(arr, p+1, h);
        }
    }

    static void quickHoare(int arr[] , int l ,int h){
        if(l < h){
            int p = hoare(arr,l,h);
            quickHoare(arr, l, p);
            quickHoare(arr, p+1, h);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,13,6,9,12,11,8};
        quickHoare(arr, 0, (arr.length-1));
        System.out.println(Arrays.toString(arr)+"  ");
    }
}
