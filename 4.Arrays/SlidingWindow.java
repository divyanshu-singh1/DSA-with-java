//problem is about finding maximum subarray of k consecutive elements
public class SlidingWindow {

    /*
     * this is naive approach from gfg O(n*k)
     * 
     */
    static int findMaxSub(int arr[] ,int k){
        int n = arr.length;
        int res = Integer.MIN_VALUE;
        for(int i = 0; (i+k-1)< n;i++){
            int curr = 0;
            for(int  j = 0; j <k;j++){
                curr += arr[i+j];
            }
            res = Math.max(res,curr);
        }
        return res;
    }

    /*
     * SLIDING WINDOW TECHNIQUE 
     * 
     */
    static int findMaxSub2(int arr[] , int k){
        // int res = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i<k;i++){
            sum+= arr[i];
        }

        for(int i = 1; i+k-1 < arr.length;i++){
            sum = Math.max(sum,(sum - arr[i-1] + arr[i+k-1]));
        }
        return sum;
    }
    public static void main(String[] args) {
        int []arr = {1,8,30,-5,20,7};
        System.out.println(findMaxSub2(arr, 4));
    }
}
