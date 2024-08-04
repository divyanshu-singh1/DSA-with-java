public class AllocateMinPages {
    static int minPages(int arr[] , int k){
        int n = arr.length;
        int sum = 0, mx = 0;
        for(int i= 0;i<n;i++){
            sum += arr[i];
            mx = Math.max(mx,arr[i]);
        }
        int low = mx, high = sum ,res =0;
        while(low <= high){
            int mid = (low+high) /2;
            if(isFeasible(arr,k,mid)){
                res = mid;              //if feasible go to
                high = mid - 1;         //the left half
            }
            else 
                low = mid+1; //else go to right half
        }
        return res;
    }
    static boolean isFeasible(int arr[] , int k ,int ans){
        int req =1 , sum = 0;
        for (int i = 0 ; i<n ;i++){
            if(sum + arr[i] >ans){
                req++;
                sum =arr[i];
            }
            else 
                sum += arr[i];

        }
        return (req <= k);
    }
    public static void main(String[] args) {

    }
}
