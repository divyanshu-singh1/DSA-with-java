import java.util.*;

public class LongestSubarrayWithGivenSum {
    static int getLongestSubarray(int arr[] , int sum){
        HashMap<Integer,Integer> map = new HashMap<>();

        int preSum = 0 ,res =0; 
        for(int i = 0 ; i < arr.length ; i++){
            preSum += arr[i];
            
            if(preSum == sum){
                res = i+1;
            }
            if(map.containsKey(preSum) == false)
                map.put(preSum,i);
            
            if(map.containsKey(preSum - sum)){
                res = Math.max(res,i-map.get(preSum-sum));
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = { 8,3,1,5,-6,6,2,2};
        System.out.println(getLongestSubarray(arr,4));
    }
}
