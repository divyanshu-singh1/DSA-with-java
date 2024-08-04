public class SubarrayWithGIvenSum {

    /*
     * this is my approach which is correct 
     * using sliding window concept of variable size
     * but very complex implementation
     */
    static boolean findSubarray(int arr[] , int val){
        int maxEnd = 0;
        int last_removed = 0;
        int n = arr.length;
        for(int i = 0 ; i<n;i++){
            if(maxEnd < val){
                System.out.println("value of max in first if at i= "+ i+" is " +maxEnd);
                maxEnd += arr[i];
            }
            if(maxEnd  == val){
                System.out.println("value of max at i= "+ i+" is " +maxEnd);
                return true;
            }
            while(maxEnd > val){
                maxEnd = maxEnd - arr[last_removed++];
                System.out.println("value of max in while at i= "+ i+" is " +maxEnd);
                if(maxEnd == val)return true;
            }
        }
        return false;
    }

    /*
     * this is gfg solution 
     * O(n)
     */
    static boolean isSubSum(int arr[],int sum){
        int s= 0,curr = 0;
        for(int e = 0 ; e<arr.length;e++){
            curr+= arr[e];
            while(sum < curr){
                curr -= arr[s++];
            }
            if(curr == sum)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {2,9,8,0,7};
        // int arr[] = {9};
        // System.out.println(findSubarray(arr, 9));
        System.out.println(isSubSum(arr, 15));
    }
}
