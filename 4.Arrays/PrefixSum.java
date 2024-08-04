public class PrefixSum {
    static int arr[]={2,8,3,9,6,5,4}, sum_arr[] = new int[arr.length];

    static{
        int sum = 0;
        for(int i = 0 ; i<arr.length;i++){
            sum+= arr[i];
            sum_arr[i] = sum;
        }
    }
    

    static int getSum(int l ,int h){
        return sum_arr[h] - sum_arr[l] + arr[l];
    }
    public static void main(String[] args) {
        System.out.println(getSum(0,2));
        System.out.println(getSum(1,3));
        System.out.println(getSum(2,6));

    }
    
}
