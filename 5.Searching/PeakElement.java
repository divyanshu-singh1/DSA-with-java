public class PeakElement {
    static int getPeak(int arr[]){
        int low = 0  ,n=  arr.length ,high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if((mid == 0 || arr[mid-1] <= arr[mid])&&
                (mid == n-1 || arr[mid+1] <= arr[mid]))
                    return mid;
            if(mid > 0 && arr[mid-1] >= arr[mid])
                high = mid-1;
            else 
                low = mid+1;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {5,20,40,30,20,50,60};
        System.out.println(getPeak(arr));
    }
}
