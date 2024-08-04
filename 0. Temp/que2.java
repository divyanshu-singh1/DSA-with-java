import java.util.Arrays;

public class que2 {
    static public int[] twoRepeated(int arr[], int n)
    {
        // Your code here
        int MOD = n+1;
        for(int i = 0 ;i < n;i++){
            arr[(arr[i]-1)%MOD] += MOD;
            System.out.println(Arrays.toString(arr));
            
        }
        System.out.println(Arrays.toString(arr));
        
        int j = 0 ;
        int res[] = new int[2];
        for(int i= 0 ;i < n;i++){
            if(arr[i]/MOD > 1){
                res[j++] = i+1;
                if(j == 2)
                    break;
            }
        }
        return res;
    }
    static public void main(String []args){
        int arr[] = twoRepeated(new int[]{1,2,1,3,4,4},4);
        System.out.println(Arrays.toString(arr));

    }
}
