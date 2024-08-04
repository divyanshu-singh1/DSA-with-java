public class SecondLarge {
    static int secondLargest(int arr[]){
        int res = -1; int largest = 0;
        int n = arr.length;
        for(int i = 1 ;i < n; i++){
            if(arr[i] > arr[largest]){
                res = largest;
                largest = i;
            }else if (arr[i] != arr[largest]){  // Ignoring if element is same as largest 
                if(res == -1 || arr[i] > arr[res]){
                    res = i;
                }
            }
        }
        return res;
    }
        public static void main(String[] args) {
        int arr[] = {10,13,14,6,33,33};
        System.out.println("Second largest element is  :"+secondLargest(arr));

    }
}
