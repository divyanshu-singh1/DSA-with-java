import java.util.Arrays;

public class ChocolateDistribution {
    static int getDistribution(int arr[] , int m ){
        int n = arr.length;
        if(m > n)return -1;
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        int res = Integer.MAX_VALUE;
        for(int i = m-1 ; i < n ; i++){
            res = Math.min(res,arr[i]-arr[i-(m-1)]);
        }
        return res;

    }
    public static void main(String[] args) {
        System.out.println(getDistribution(new int[]{3,4,1,9,56,7,9,12},5));
    }
}
