public class PairSum {
    static boolean findPair(int arr[] , int x){
        int  i = 0 ,j = arr.length -1;
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
    public static void main(String[] args) {
        int arr[] = {2,4,8,9,11,12,20,30};
        findPair(arr, 30);
    }
}
