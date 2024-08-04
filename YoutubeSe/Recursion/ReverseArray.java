
public class ReverseArray {
    static void revArr(int arr[] , int i , int j){
        if(i >= j)
            return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        revArr(arr, i+1, j-1);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        revArr(arr,0,arr.length-1);
        for(int x : arr){
            System.out.print(x+" ");
        }
        
        
    }
}
