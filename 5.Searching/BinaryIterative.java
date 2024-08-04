public class BinaryIterative{
    static int binarySearch(int arr[] , int key ){
        int i = 0;
        int j = arr.length -1;
        int mid;
        while(i <= j){
            mid = (i+j)/2;
            if(arr[mid] == key)return mid;
            else if(arr[mid] < key){
                i = mid+1;
            }else{
                j = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int arr[] = {12,16,18,32,56};
        int arr[] ={10,10};
        System.out.println(binarySearch(arr,10));
    }
}
