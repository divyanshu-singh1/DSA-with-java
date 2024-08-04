import java.util.Arrays;
public class ques {
    static void safePos(int arr[]) {
        // code here

        int n = arr.length;
        int pair_count = 0;
        for(int i = 0 ;i<n;i++){
            for(int j = 0 ; j < n ;j++){
                if(arr[j] >= 2*arr[i]){
                    arr[j] = -1;
                    arr[i] = -1;
                    pair_count++;
                }
            }
        }
        System.out.println(pair_count+" "+(n - (2*pair_count)));
        
}
    public static void main(String[] args) {
        int arr[]  = {1,2,3,4,5};
        safePos(arr);
        
    }
}
