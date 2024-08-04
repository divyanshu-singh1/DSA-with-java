import java.util.Arrays;

public class SortArrayOfThreeTypesOfElements {

    static void func(int arr[]){
        int low = 0 , mid = 0 , high = arr.length -1;

        while(mid <= high){
            if(arr[mid] == 0 ){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                low++;
                mid++;
            }else if(arr[mid] == 1)
                mid++;
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,1,1,2};
        func(arr);
        System.out.println(Arrays.toString(arr));
    }
}
