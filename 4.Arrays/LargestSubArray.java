public class LargestSubArray {

    //THis is naive approach 
    /*
     * it was my as well as gfg naive approch
     * time O(n^2)
     * 
     */
    static int maxSubarray(int []arr){
        int n = arr.length;

        int res = arr[0], temp;
        for(int i = 0 ; i <n ;i++){
            temp = 0;
            for(int j = i ; j < n ;j++){
                temp = temp + arr[j];
                res = Math.max(res,temp);
            }
        }
        return res;
    }
    /*
     * Second approach
     * this approach is on the basis that agar koi subarrat hai max to woh us element par end karegi 
     * jisse hum loop chala rahe hain matbal is
     * already humare pass ek maxENding hai so new maxEnding me ya to naya element judega
     * ya woh khud ek nayi sub array start karega
     *  i.e maxEnd = max(maxEnd + arr[i] , arr[i])
     * 
     * also we have to update result too
     * 
     * TIme complexity is clearly O(n)
     * 
     */
    static int maxSubarray2(int arr[]){
        int res = arr[0],temp = arr[0] ;
        for(int i = 1; i< arr.length;i++){
            temp = Math.max(temp+arr[i],arr[i]);
            res = Math.max(res,temp);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {-3,8,-2,4,-5,6};
        System.out.println("with efficient sol "+maxSubarray2(arr));
    }
}
