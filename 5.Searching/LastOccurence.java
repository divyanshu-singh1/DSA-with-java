public class LastOccurence {
    static int findLast(int arr[] , int key){
        int start = 0 ;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] > key)
                end = mid-1;
            else if(arr[mid] < key)
                start = mid +1;
            else {
                if(mid == arr.length -1 || arr[mid+1] != arr[mid])
                    return mid;
                else    
                    start = mid +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int arr[] = { 1,10,10,10,20,40,40};
        System.out.println(findLast(arr, 40));
    }
}
