public class TripletSum {
    static boolean findPair(int arr[] , int x,int i){
        int j = arr.length-1;
        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum == x){
                //System.out.println("the pair is " +arr[i] +"\t"+arr[j]);
                return true;
            }
            else if(sum > x)
                j--;
            else
                i++;
        }
        return false;
        // System.out.println("No Such Pair Exists");
    }
    /*
     * works in O(n^2)
     * even for un sorted arrays we can sort the array in nlogn and then run this method and
     * 
     * total time complexity would be same i.e O(n^2)
     */
    static boolean findTriplet(int arr[],int val){
        for(int i = 0 ;i<arr.length-2;i++){
            if(findPair(arr,(val-arr[i]), i+1))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] ={2,3,4,8,9,20,40};
        System.out.println(findTriplet(arr,69));
    }
}
