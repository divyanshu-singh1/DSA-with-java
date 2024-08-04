import java.util.Arrays;

public class MaxCircularSubarraySum {

    //this is my naive approach
    static int getMaxCircularSubarraySum(int arr[]){
        int res = arr[0],maxEnd = arr[0],n = arr.length;

        //getting res for noraml array
        for(int i =1; i<n ;i++){
            maxEnd = Math.max(maxEnd+arr[i],arr[i]);
            res = Math.max(maxEnd,res);
        }
        System.out.println("nomrl arr " + Arrays.toString(arr)+" with res = " + res);

        
        //rotating array n-1 times and calculating max
        for(int i = 1 ; i< n ;i++){

            //roatating array
            int var1 = arr[0];
            for(int j = 1 ; j<n;j++){
                arr[j-1] = arr[j];
            }
            arr[n-1] = var1;
            System.out.println("Array after " + i+" roatation " + Arrays.toString(arr));

            int temp = arr[0];
            maxEnd = arr[0];

            for(int j =1; j<n ;j++){
                maxEnd = Math.max(maxEnd+arr[j],arr[j]);
                temp = Math.max(maxEnd,temp);
            }

            //updating res by comparing it to max Sum after rotation
            res = Math.max(res,temp);
            System.out.println("res after " + i+" th roation " +res);
        }
        return res;
    }

    //gfg naive approach 
    /*
     * Uses moduler arithmatic to calculate sum of subarrays starting at all indexs 
     * O(n^2)
     * 
     * 
     */
    static int getSum(int []arr){
        int res = arr[0];
        int n = arr.length;
        for(int i = 0 ; i< n;i++){
            int curr_sum = arr[i] ; 
            int curr_max = arr[i];

            for(int  j = 1 ;j<n;j++){
                int index  = (i+j)%n;
                curr_sum += arr[index];
                curr_max = Math.max(curr_sum,curr_max);

            }
            res = Math.max(curr_max,res);
        }
        return res;
    }

    /*
     * idea is getting max of these two 
     *  1. Max subarray sum of normal array
     *  2. Max sum  of circular subarray 
     * 
     *  2 can be get by 
     *      (whole array sum) - (min subarray sum  in normal array);
     * 
     * THis is my solution
     */

     static int getSum2(int arr[]){
        int  n = arr.length;
        int temp_min = arr[0] , temp_max = arr[0] , min_sum = arr[0], max_sum = arr[0], total_sum = arr[0];

        for(int i = 1 ;  i< n ;i++){
            temp_max = Math.max(temp_max + arr[i],arr[i]);
            max_sum = Math.max(max_sum,temp_max);

            temp_min = Math.min(temp_min+arr[i],arr[i]);
            min_sum = Math.min(min_sum,temp_min);

            total_sum += arr[i];
        }

        System.out.println("max sum is " + max_sum +"\nmin sum is "+ min_sum);
        System.out.println("total sum is " + total_sum);

        /*
         * if was sum is negative it means that all elements in array are negative
         * so max sum would be the answer
         * 
         */
        if(max_sum < 0){
            return max_sum;
        }
        int circular_max_sum = total_sum - min_sum;
        int res =  Math.max(circular_max_sum,max_sum);

        return  res;
     }

     /*this is gfg's efficient solution
      * 
      */

    //this kadane's algorithm used to find max and min sum in normal array
    static int normalMaxSum(int arr[]){
        int maxEnding = arr[0] , normal_max = arr[0];
        for(int i = 1 ;i<arr.length ; i++){
            maxEnding = Math.max(maxEnding + arr[i] , arr[i]);
            normal_max = Math.max(normal_max,maxEnding);
        }
        return normal_max;
    }

     static int overallMaxSum(int arr[]){
        int normal_max = normalMaxSum(arr);
        if(normal_max < 0)return normal_max;

        int arr_sum = 0;
        //calculating total array sum and invertin all array numbers
        //bcoz finding max subarray sum in inverted array is same as finding
        //min subarray sum in normal array; 
        for(int i = 0 ; i< arr.length; i++){
            arr_sum += arr[i];
            arr[i] = -arr[i];
        }
        int max_circular = arr_sum + normalMaxSum(arr);
        return Math.max(normal_max,max_circular);
     }

    public static void main(String[] args) {
        // int arr[] = {-3,-4,-5,-6,-8};
        int arr[] = {8,-4,3,-5,4};
        // System.out.println(getMaxCircularSubarraySum(arr));
        // System.out.println(getSum2(arr));
        System.out.println(overallMaxSum(arr));
    }
}
