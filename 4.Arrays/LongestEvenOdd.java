public class LongestEvenOdd {
    /*
     * same my and gfg approach works in O(n) complexity
     */
    static int maxEvenOddSubarr(int []arr){
        int res = 1 , count = 1 ;

        for(int i = 1 ; i< arr.length ; i++){
            if((arr[i-1]%2 == 1 && arr[i]%2 == 0) || (arr[i]%2 == 1 && arr[i-1]%2 == 0)){
                count++;
                res = Math.max(count,res);
            }
            else
                count =1 ;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {10,12,8,4};
        System.out.println(maxEvenOddSubarr(arr));
    }
}
