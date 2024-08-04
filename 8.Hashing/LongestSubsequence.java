import java.util.*;

public class LongestSubsequence {
    static int naive(int arr[] , int n){
        Arrays.sort(arr);
        int res = 1; curr = 1;
        for(int i = 0 ; i< n ;i++){
            if(arr[i]==arr[i-1]+1)
                curr++;
            else if(arr[i] != arr[i-1]){
                res = Math.max(res,curr);
                curr = 1;
            }
        }
        return Math.max(curr, res);
    }
    public static void main(String[] args) {
        
    }
}
