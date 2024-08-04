import java.util.Arrays;
public class ReverseArray {
    static void reverse(int arr[]){
        int n = arr.length;
        int i = 0 , j = n-1;
        while(i<j){
            int temp =  arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
    }
    public static void main(String []args){
        int arr[] = {10,5};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}
