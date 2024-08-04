public class BinaryRecursive {
    static int binarySearch(int arr[] ,int key,int start,int end){
        if(start > end)return -1;
        int mid = (start + end)/2;
        if(arr[mid] == key)return mid;
        else if (arr[mid] < key){
            return binarySearch(arr, key, mid + 1, end);
        }else
            return binarySearch(arr, key, start, mid-1);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,44,90};
        System.out.println(binarySearch(arr, 44, 0, 4));
    }
}
