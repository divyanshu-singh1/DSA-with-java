import java.util.*;
public class SubsetSum {
    //that is a basic solution 
    //Optimised solution can be made using backtracking and DP

    static int  getSubsetSum(int []arr ,int n , int sum){
        if(n==0)
            return (sum == 0) ? 1 : 0;

        return getSubsetSum(arr,n-1,sum) + getSubsetSum(arr, n-1, sum - arr[n-1]);
    }
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,20,15};
        int sum = 25;
        System.out.println(getSubsetSum(arr,arr.length,sum));
    }
}
