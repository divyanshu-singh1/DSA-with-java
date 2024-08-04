public class FirstOccurence {
    // my appraoac but it worst case it can go upp to O(n) so sshit it is
    static int findFirst(int arr[] ,int val){
        int start = 0;
        int end = arr.length  -1;
        while(start <= end){
            int mid = (start + end)/2;
            while(arr[mid] == val){
                if(mid > 0 && arr[mid-1] == val)mid--;
                else 
                 return mid;
            }
            if(arr[mid] < val){
                start = mid+1;
            }else
                end = mid-1;
        }
        return -1;
    }
    /*
     * gfg solution optimal and works in O(logN)
     */
    static int findFirst2(int arr[] ,int key){
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
    public static void main(String[] args) {
        int arr[] = {10,10,10,20,20,40};
        System.out.println(findFirst2(arr,10));
    }
}
