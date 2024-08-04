public class SearchInRotated {
    static int search(int x,int arr[]){
        int low = 0 , high = arr.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == x)return mid;
            if(arr[mid] >= arr[low]){
                if(x >= arr[low] && x < arr[mid])
                    high = mid-1;
                else    
                    low= mid+1;
            }else{
                if(arr[mid] < x &&  x <= arr[high])
                    low = mid+1;
                else 
                    high = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {4,5,1,2,3};
        System.out.println(search(5, arr));
    }
}
