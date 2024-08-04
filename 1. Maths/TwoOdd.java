public class TwoOdd {
    static void findTwoOdd(int []arr ,int n){
        int x = arr[0];
        for(int i = 1; i < n ; i++){
            x = x ^ arr[i];
        }

        ///till now its same code as one odd occurenece

        int k = (x&(~(n-1)));
        int res1 = 0, res2 = 0;
        for(int i = 0 ; i < n ; i++){
            if((arr[i]&k) != 0)
                res1 = res1 ^ arr[i];
            else 
                res2 = res2 ^ arr[i];
        }
        System.out.println(res1+"\t"+res2);

    }
    public static void main(String []args){
        // Scanner sc = new Scanner(System.in);
        int arr[] = {2,3,3,2,4,2,4,6};
        int n = arr.length;

        findTwoOdd(arr,n);
    }
}