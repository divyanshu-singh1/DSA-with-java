public class CountOccurence {
    /*
     * we simply get first and last occurence in O(logn)
     * then do last-first index +1;
     */
    static int getCount(int arr[] , int val){
        int first = findFirst(arr,val);
        if(first == -1)
            return 0;
        else   
            return (findLast(arr,val)-first+1);

    }
    public static void main(String[] args) {
        
        int arr[] = {10,20,20,20,40,40};
        System.out.println(getCount(arr, 43));
    }
    static int findFirst(int arr[] ,int key){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid  = (start + end )/2;
            if(arr[mid] < key){
                start = mid +1;
            }else if(arr[mid] > key){
                end = mid -1;
            }else{
                if(mid == 0 || arr[mid-1] != arr[mid]){
                    return mid;
                }else
                    end = mid -1;

            }
        }
        return -1;
    }

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
}
